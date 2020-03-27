package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyPage {
	public static WebDriver driver;
	
	
	
@FindBy(xpath = "//input[@name='radiobutton_0']")
private WebElement  selectbox;

@FindBy(xpath = "//input[@type='submit']")
private WebElement conti ;



public VerifyPage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);
}

public WebElement getSelectbox() {
	return selectbox;
}

public WebElement getConti() {
	return conti;
}

	

}
