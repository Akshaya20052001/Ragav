package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo {
	public WebDriver driver;

	@FindBy(xpath = "//a[.='Create new account']")
	private WebElement createnewaccount;

	public Demo(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreatenewaccount() {
		return createnewaccount;
	}

}
