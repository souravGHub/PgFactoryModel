package com.ssg.base;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.ssg.pages.actions.TopNavigation;
import com.ssg.utilities.ExcelReader;
import com.ssg.utilities.ExtentManager;
public class Page {
/*
 * WebDriver
 * ExcelReader
 * Logs
 * WebDriverWait
 * ExtentReports
 * 
 */
	public static WebDriver driver;// static as all child pages should use the same driver reference.
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir") 
			+"\\src\\test\\resources\\excel\\testdata.xlsx");
	public static WebDriverWait wait;
	public ExtentReports extentRep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static String browser; 
	public static TopNavigation topNav;
	public static void initConfiguration() {    //sets webdrivers, browser,constants top menu navigation etc
		if(Constants.BROWSER.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+
			"\\src\\test\\resources\\executables\\geckodriver.exe"); // We need to use this is latest firefox driver is being used	
			driver = new FirefoxDriver();
			log.debug("Firefox Launched");			
		}else if(Constants.BROWSER.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")
			+"\\src\\test\\resources\\executables\\chromedriver.exe");					
			log.debug("Chrome Launched");
			Map<String,Object> prefs= new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications",2);
			prefs.put("credentials_enable_service",false);
			prefs.put("profile.password_manager_enabled",false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs",prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");				
			driver = new ChromeDriver(options);	
			log.debug("Chrome Launched");
		}else if(Constants.BROWSER.equals("ie")) {
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")
					+"\\src\\test\\resources\\executables\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			log.debug("IE Launched");
		}	
		driver.get(Constants.TESTSITEURL);		
		driver.manage().window().fullscreen();
//		driver.manage().timeouts().implicitlyWait(Constants.IMPLICITWAIT, TimeUnit.SECONDS);
		
		topNav = new TopNavigation(driver);				
	}
	
	public static void quitBrowser() {
			driver.quit();
	}
}
