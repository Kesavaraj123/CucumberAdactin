Feature: Testing login function on adactin application 

Background: 
	Given user to launch the browser 
	When user to login to  application 
	
@login 
Scenario Outline:user checking the login funtion using valid username and valid password 
	Given  user launch the adactin application 
	When user enter valid username "<username>" on user name field 
	And user enter valid password "<password>" on password field 
	And user click on the login button 
	Then user validate the name Of the user in homepage 
	
	Examples: 
		|username|password|
		|asadas|12334|
		|keshavunique|12345678|
		
		
		Scenario: user to  fill the booking details 
			Given user navigated to booking details page 
			When user to select the  location 
			And user to select the hotel 
			And user to select the  roomtype 
			And user to select  the number of room 
			And  user to enter the check-in date 
			And user to enter the check-out date 
			And user to select the number of adult guest 
			And user to select the number of guest children 
			And user to click on the search button 
			Then user confirms the booking details are filled 
			
		Scenario: user to validate the booked details 
			Given user navigated to booked details page 
			When  user to click on the check box button 
			And  user to click on the Continue button 
			Then user confirmes the user booked details page 
			
			
		Scenario: user to fill personal details and done  payment 
			Given user navigated to payment page 
			When user to fill the valid firstname "keshav " in firstname field 
			And   user to fill the valid lastname  "billa " in lastname field 
			And user to fill valid address "no 67 sri abirami garden unnalamai chetty" on the address field 
			And user to give valid credit card number "1234567891234567"  on the credit card filed 
			And user to select valid credit card type on the credit card type field 
			And user to select valid expire  month on month field 
			And user to select valid expire year on year field 
			And user to fill valid ccv number "366" on ccv field 
			And user to click on book now button 
			Then user to validate the payment had done 
			
		Scenario: user checking booking is confired and done logout 
			Given user navigated to confirmation page 
			When  user to click on the Logout button 
			Then  user to validate the account logout 
			
			
			
			
			
