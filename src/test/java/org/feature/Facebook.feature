Feature: Login to Facebook 

Scenario: successfully creating a login page.
Given user login to the url as "https://www.facebook.com/"
Then user click on "Create a new Account"

#Scenario: To verfiy the Sign Up page 
Given user enter the First name as "Chandra" surname as "Pandiyan"
And user enter the email as "akshayapandiyan02@gmail.com"
When enter the Password as "Achu@123"
And user select the Date of birth as "19" and month as "5" and year as "2001"
And user select the Gender as "Female" 
Then user click on "sign up" and successfully logged into the Facebook Page.

