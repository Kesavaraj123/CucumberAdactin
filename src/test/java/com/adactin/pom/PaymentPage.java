package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	 public static WebDriver driver;
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement fistname;

	@FindBy(xpath = "(//input[@type='text'])[12]\")")
	private WebElement lastname;
	@FindBy(xpath = "//textarea[@class='txtarea']")
	private WebElement address;
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement creditcard;
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardtype;
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expmonth;

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expyear;

	@FindBy(id = "cc_cvv")
	private WebElement ccvnum;

	@FindBy(xpath = "(//input[@type='button'])[1])")
	private WebElement sub;
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	private WebElement logout;

	
	public WebElement getLogout() {
		return logout;
	}


	public PaymentPage(WebDriver driver2) {
		this.driver=driver2;
		
PageFactory.initElements(driver, this);
	
	
	}


	public WebElement getFistname() {
		return fistname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCreditcard() {
		return creditcard;
	}


	public WebElement getCardtype() {
		return cardtype;
	}


	public WebElement getExpmonth() {
		return expmonth;
	}


	public WebElement getExpyear() {
		return expyear;
	}


	public WebElement getCcvnum() {
		return ccvnum;
	}


	public WebElement getSub() {
		return sub;
	}


	
	
}



