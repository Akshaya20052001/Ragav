package org.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\org\\feature\\Facebook.feature",
glue = "org.stepdefinition",
monochrome = true)

public class Demo_run {

	public static WebDriver driver;

	@BeforeClass
	public static void start() {

		ChromeOptions a = new ChromeOptions();
		a.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(a);

	}

	public void end() {
//		driver.quit();

	}
}
