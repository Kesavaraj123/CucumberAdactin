package com.adactin.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kesavaraj\\eclipse-workspace\\CucumberAdactin\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();
		WebElement mail = driver.findElement(By.id("email_create"));
		mail.sendKeys("kunique307@gmail.com");
		WebElement createaccountclick = driver.findElement(By.id("SubmitCreate"));
		createaccountclick.click();

	}

}
