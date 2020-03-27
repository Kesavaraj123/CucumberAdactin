package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	
	public static WebDriver driver;
	@FindBy(xpath = "(//select[@class='search_combobox'])[1]")
	private WebElement country;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement roomcount;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement indate;
	
	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement outdate;

	@FindBy(id = "adult_room")
	private WebElement guest;

	@FindBy(id = "child_room")
	private WebElement childcount;

	public WebElement getChildcount() {
		return childcount;
	}

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement search;

	
	public BookingPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomcount() {
		return roomcount;
	}

	public WebElement getGuest() {
		return guest;
	}

	public WebElement getSearch() {
		return search;
	}

}
