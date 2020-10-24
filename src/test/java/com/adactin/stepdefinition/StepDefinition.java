package com.adactin.stepdefinition;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.BookingPage;
import com.adactin.pom.PaymentPage;
import com.adactin.pom.SignPage;
import com.adactin.pom.VerifyPage;
import com.adactin.runner.Runner;
import com.configuration.property.FileReadManager;
import com.configuration.property.PomObjectManager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {

	// public static WebDriver driver= browserLaunch("chrome");
	public static WebDriver driver = Runner.driver;
	public static PomObjectManager pom = new PomObjectManager(driver);

	@Given("^user to launch the browser$")
	public void user_to_launch_the_browser() throws Throwable {
		System.out.println("User Launch the broswer:BackGround");
	}

	@When("^user to login to  application$")
	public void user_to_login_to_application() throws Throwable {
		System.out.println("user login in the application");

	} 

	@Given("user launch the adactin application")
	public void user_launch_the_adactin_application() throws InterruptedException, IOException {

		String url = FileReadManager.GetInstance().CrInstance().getUrll();
		getUrl(url);
		Thread.sleep(5000);
	}

	@When("^user enter valid username \"([^\"]*)\" on user name field$")
	public void user_enter_the_user_name(String username) throws IOException {
		// SignPage sp = new SignPage(driver);

		// typehere(, "keshavunique");

		// String userName = FileReadManager.GetInstance().CrInstance().userName();
		typehere(pom.getSp().getUsername(), username);

	}

	@When("^user enter valid password \"([^\"]*)\" on password field$")
	public void user_enter_the_password(String password) throws IOException {
		// SignPage sp = new SignPage(driver);
		// String passwor = FileReadManager.GetInstance().CrInstance().getPasswor();
		typehere(pom.getSp().getPassword(), password);
	}
	

	@When("user click on the login button")
	public void user_click_on_the_login_button() throws IOException, InterruptedException {
		// SignPage sp = new SignPage(driver);

		click(pom.getSp().getLoginbutton());
		Thread.sleep(9000);

	}

	@When("^user take screenshot$")
	public void user_take_screenshot(String login) throws Throwable {
		screenShot(login);
	}

	@Then("user validate the name Of the user in homepage")
	public void user_validate_the_name_Of_the_user_in_homepage() {
		System.out.println("just");

	}

	/*
	 * @Given("user navigated to booking details page") public void
	 * user_navigated_to_booking_details_page() throws InterruptedException {
	 * System.out.println("navigated"); Thread.sleep(3000); }
	 */

	@When("user to select the  location")
	public void user_to_select_the_location() throws IOException {
		// BookingPage bp = new BookingPage(driver);
		dropDown(pom.getBp().getCountry(), "text", "Adelaide");
		// String location = FileReadManager.GetInstance().CrInstance().getLocation();
	}

	@When("user to select the hotel")
	public void user_to_select_the_hotel() throws IOException {

		// BookingPage bp = new BookingPage(driver);
		// String hotel = FileReadManager.GetInstance().CrInstance().getHotel();

		dropDown(pom.getBp().getHotel(), "value", "Hotel Sunshine");
	}

	@When("user to select the  roomtype")
	public void user_to_select_the_roomtype() throws IOException {
		// BookingPage bp = new BookingPage(driver);
		// String roomType = FileReadManager.GetInstance().CrInstance().getRoomType();

		dropDown(pom.getBp().getRoomtype(), "text", "Super Deluxe");
	}

	@When("user to select  the number of room")
	public void user_to_select_the_number_of_room() throws IOException {
		// BookingPage bp = new BookingPage(driver);
		// String roomCount = FileReadManager.GetInstance().CrInstance().getRoomCount();
		dropDown(pom.getBp().getRoomcount(), "text", "1 - One");

	}

	@When("user to enter the check-in date")
	public void user_to_enter_the_check_in_date() {
		// BookingPage bp = new BookingPage(driver);
		typehere(pom.getBp().getIndate(), "02/02/2020");

	}

	@When("user to enter the check-out date")
	public void user_to_enter_the_check_out_date() {
		// BookingPage bp = new BookingPage(driver);
		typehere(pom.getBp().getOutdate(), "28.3.2020");

	}

	@When("user to select the number of adult guest")
	public void user_to_select_the_number_of_adult_guest() throws IOException {
		// BookingPage bp = new BookingPage(driver);
		// String adult = FileReadManager.GetInstance().CrInstance().getAdult();
		dropDown(pom.getBp().getGuest(), "text", "2 - Two");

	}

	@When("user to select the number of guest children")
	public void user_to_select_the_number_of_guest_children() throws IOException {
		// BookingPage bp = new BookingPage(driver);
		// String child = FileReadManager.GetInstance().CrInstance().getChild();
		dropDown(pom.getBp().getChildcount(), "text", "1 - One");

	}

	@When("user to click on the search button")
	public void user_to_click_on_the_search_button() {
		// BookingPage bp = new BookingPage(driver);
		click(pom.getBp().getSearch());
	}

	@Then("user confirms the booking details are filled")
	public void user_confirms_the_booking_details_are_filled() {

	}

	@Given("user navigated to booked details page")
	public void user_navigated_to_booked_details_page() {
	}

	@When("user to click on the check box button")
	public void user_to_click_on_the_check_box_button() {
		// VerifyPage vp = new VerifyPage(driver);
		click(pom.getVp().getSelectbox());
	}

	@When("user to click on the Continue button")
	public void user_to_click_on_the_Continue_button() throws InterruptedException {
		VerifyPage vp = new VerifyPage(driver);
		click(pom.getVp().getConti());
		Thread.sleep(2000);
	}

	@Then("^user confirmes the user booked details page$")
	public void user_confirmes_the_user_booked_details_page() throws Throwable {

	}

	@Given("^user navigated to payment page$")
	public void user_navigated_to_payment_page() throws Throwable {
		Thread.sleep(3000);

	}

	@When("^user to fill the valid firstname \"([^\"]*)\" in firstname field$")
	public void user_to_fill_the_valid_firstname_in_firstname_field(String firstname) throws Throwable {
		// PaymentPage pm = new PaymentPage(driver);
		// String fistName = FileReadManager.GetInstance().CrInstance().getFistName();
		typehere(pom.getPp().getFistname(), firstname);

	}

	@When("^user to fill the valid lastname  \"([^\"]*)\" in lastname field$")
	public void user_to_fill_the_valid_lastname_in_lastname_field(String lastname) throws Throwable {
		// PaymentPage pm = new PaymentPage(driver);
		// String lastName = FileReadManager.GetInstance().CrInstance().getLastName();
		typehere(pom.getPp().getLastname(), lastname);
	}

	@When("^user to fill valid address \"([^\"]*)\" on the address field$")
	public void user_to_fill_valid_address_on_the_address_field(String address) throws Throwable {
		// PaymentPage pm = new PaymentPage(driver);
		// String address = FileReadManager.GetInstance().CrInstance().getAddress();
		typehere(pom.getPp().getAddress(), address);

	}

	@When("^user to give valid credit card number \"([^\"]*)\"  on the credit card filed$")
	public void user_to_give_valid_credit_card_number_on_the_credit_card_filed(String creditnum) throws Throwable {
		// PaymentPage pm = new PaymentPage(driver);
		// String creditCard =
		// FileReadManager.GetInstance().CrInstance().getCreditCard();
		typehere(pom.getPp().getCreditcard(), creditnum);
	}

	@When("^user to select valid credit card type on the credit card type field$")
	public void user_to_select_valid_credit_card_type_on_the_credit_card_type_field() throws Throwable {
		// PaymentPage pm = new PaymentPage(driver);
		// String cardType = FileReadManager.GetInstance().CrInstance().getCardType();
		dropDown(pom.getPp().getCardtype(), "text", "VISA");
	}

	@When("^user to select valid expire  month on month field$")
	public void user_to_select_valid_expire_month_on_month_field() throws Throwable {
		// PaymentPage pm = new PaymentPage(driver);
		// String expMonth = FileReadManager.GetInstance().CrInstance().getExpMonth();
		dropDown(pom.getPp().getExpmonth(), "text", "February");
	}

	@When("^user to select valid expire year on year field$")
	public void user_to_select_valid_expire_year_on_year_field() throws Throwable {
		// PaymentPage pm = new PaymentPage(driver);
		// String expYear = FileReadManager.GetInstance().CrInstance().getExpYear();
		dropDown(pom.getPp().getExpyear(), "text", "2014");
	}

	@When("^user to fill valid ccv number \"([^\"]*)\" on ccv field$")
	public void user_to_fill_valid_ccv_number_on_ccv_field(String ccv) throws Throwable {
		// PaymentPage pm = new PaymentPage(driver);
		// String cvv = FileReadManager.GetInstance().CrInstance().getCvv();
		typehere(pom.getPp().getCcvnum(), ccv);
	}

	@When("^user to click on book now button$")
	public void user_to_click_on_book_now_button() throws Throwable {
		// PaymentPage pm = new PaymentPage(driver);
		click(pom.getPp().getSub());
		Thread.sleep(5000);
	}

	@Then("^user to validate the payment had done$")
	public void user_to_validate_the_payment_had_done() throws Throwable {

	}

	@Given("^user navigated to confirmation page$")
	public void user_navigated_to_confirmation_page() throws Throwable {
	}

	@Then("^user to click on the Logout button$")
	public void user_to_click_on_the_Logout_button() throws Throwable {
		// PaymentPage pm = new PaymentPage(driver);

		click(pom.getPp().getLogout());
		Thread.sleep(5000);
	}

	
	  @Then("^user to validate the account logout$") public void
	  user_to_validate_the_account_logout() throws Throwable {
	  
	  browserLaunch("chrome"); 
	  String url =FileReadManager.GetInstance().CrInstance().getUrll(); getUrl(url);
	  Assert.assertEquals("", "    "); 
	  }
	 
}
