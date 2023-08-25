package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo_2 {

	public WebDriver driver;

	public Demo_2(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement fristname;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement surname;

	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement email;

	@FindBy(xpath = "//input[contains(@name,'mail_confirmation')]")
	private WebElement re_email;

	public WebElement getRe_email() {
		return re_email;
	}

	@FindBy(xpath = "//input[@aria-label='New password']")
	private WebElement password;

	@FindBy(xpath = "//select[@id='day']")
	private WebElement day;

	@FindBy(xpath = "//select[@name='birthday_month']")
	private WebElement month;

	@FindBy(xpath = "//select[@id='year']")
	private WebElement yr;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement Female;

	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement male;

	@FindBy(xpath = "(//input[@type='radio'])[3]")
	private WebElement custom;

	@FindBy(xpath = "//button[@name='websubmit']")
	private WebElement signup;

	public WebElement getFristname() {
		return fristname;
	}

	public WebElement getSurname() {
		return surname;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYr() {
		return yr;
	}

	public WebElement getFemale() {
		return Female;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getCustom() {
		return custom;
	}

	public WebElement getSignup() {
		return signup;
	}

}
