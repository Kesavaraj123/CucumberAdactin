package com.configuration.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.pom.BookingPage;
import com.adactin.pom.PaymentPage;
import com.adactin.pom.SignPage;
import com.adactin.pom.VerifyPage;

public class PomObjectManager {
	public static WebDriver driver;
	public static SignPage sp;
	public static BookingPage bp;
	public static VerifyPage vp;
	public static PaymentPage pp;
	
	public PomObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public static  SignPage getSp() {
		sp=new SignPage(driver);
		
		return sp;
	}
	public static BookingPage getBp() {
		bp= new BookingPage(driver);
		return bp;
	}
	public static VerifyPage getVp() {
		vp= new VerifyPage(driver);
		return vp;
	}
	public static PaymentPage getPp() {
		pp = new PaymentPage(driver);
		return pp;
	}
	
}
