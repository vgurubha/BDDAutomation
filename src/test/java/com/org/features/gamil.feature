Feature: Login page scenarios
 

  @raju
  Scenario: Verify the username and password text boxes
  	Given User should be open the facebook login page
  	Then user verifies username textbox
  	And user verifies password textbox

  @bhaskar
  Scenario: Verify possitive login
	  Given User should be open the facebook login page
	  When User enter user name in to textbox
	  And User enter password into textbox
	  And User click on submit button
	  Then User veify the homepage logo
	  
	@rahul
	Scenario: Negitive login
	Given User should be open the facebook login page
	 When User enter incorrect user name in to textbox
	  And User enter incorrect password into textbox
	  And User click on submit button
	  Then User veify error message
  
  