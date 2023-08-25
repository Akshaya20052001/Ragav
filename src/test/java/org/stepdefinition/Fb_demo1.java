package org.stepdefinition;

import org.base.Demo_base;
import org.openqa.selenium.WebDriver;
import org.pom.Demo;
import org.pom.Demo_2;
import org.runner.Demo_run;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fb_demo1 extends Demo_base {

	public static WebDriver driver = Demo_run.driver;

	public static Demo a = new Demo(driver);
	public static Demo_2 b = new Demo_2(driver);

	@Given("user login to the url as {string}")
	public void user_login_to_the_url_as(String url) {
		url(driver, url);

	}

	@Then("user click on {string}")
	public void user_click_on(String string) throws InterruptedException {
		click(a.getCreatenewaccount());
		System.out.println(string);
		Thread.sleep(5000);

	}

	@Given("user enter the First name as {string} surname as {string}")
	public void user_enter_the_first_name_as_surname_as(String string, String string2) {
//		click(b.getFristname());
		sendkeys(b.getFristname(), string);
		sendkeys(b.getSurname(), string2);
	}

	@Given("user enter the email as {string}")
	public void user_enter_the_email_as(String string) {
		sendkeys(b.getEmail(), string);
		sendkeys(b.getRe_email(), string);
	}

	@When("enter the Password as {string}")
	public void enter_the_password_as(String string) {
		sendkeys(b.getPassword(), string);

	}

	@When("user select the Date of birth as {string} and month as {string} and year as {string}")
   public void user_select_the_date_of_birth_as_and_month_as_and_year_as(String string, String string2, String string3) {
		selectvalue(b.getDay(), string);
		selectvalue(b.getMonth(), string2);
		selectvalue(b.getYr(),string3);
	}

	@When("user select the Gender as {string}")
	public void user_select_the_gender_as(String string) {
		click(b.getFemale());
	}

	@Then("user click on {string} and successfully logged into the Facebook Page.")
	public void user_click_on_and_successfully_logged_into_the_facebook_page(String string) {
		click(b.getSignup());
	}

}
