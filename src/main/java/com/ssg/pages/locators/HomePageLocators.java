package com.ssg.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
//locators for flight page
//@FindBy(xpath = "//button[@id='tab-flight-tab-hp']/span[2]")
@FindBy(xpath = "//button[starts-with(@id,'tab-flight-tab')]")
public WebElement flightTab;	
@FindBy(css = "#flight-type-roundtrip-label-hp-flight")	
public WebElement roundTrip;


//locators for flight booking
	
@FindBy(css = "#flight-origin-hp-flight")	
public WebElement fromCity;
@FindBy(css = "#flight-destination-hp-flight")	
public WebElement toCity;

@FindBy(xpath = "//*[@id=\"aria-option-0\"]/div[2]")	
public WebElement clickCity;

@FindBy(css = "#flight-departing-hp-flight")	
public WebElement departDate;
@FindBy(css = "#flight-returning-hp-flight")	
public WebElement returnDate;



@FindBy(css = "#traveler-selector-hp-flight")	
public WebElement noOfTravelersButton;
@FindBy(xpath = "//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[1]/div[4]")	
public WebElement noOfAdults;

@FindBy(xpath = "//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[2]/div[1]/div[4]")	
public WebElement noOfChildren;

@FindBy(xpath = "//select[@id=\"flight-age-select-1-hp-flight\"]")	
public WebElement ageOfChild;

@FindBy(xpath = "//*[@id=\"gcw-flights-form-hp-flight\"]/div[9]/label/button")	
public WebElement searchBtn;

	
}
