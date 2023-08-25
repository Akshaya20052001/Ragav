package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo_base {

	public static void maxi(WebDriver e) {
		e.manage().window().maximize();
	}

	public static void mini(WebDriver e) {
		e.manage().window().minimize();
	}

	public static void fullscreen(WebDriver e) {
		e.manage().window().fullscreen();
	}

	public static void getsize(WebDriver e) {
		e.manage().window().getSize();
	}

	public static void setsize(WebDriver e, Dimension a) {
		e.manage().window().setSize(a);

	}

	public static void url(WebDriver e, String s) {
		e.get(s);

	}

//WebElements
	public static void click(WebElement e) {
		e.click();

	}

	public static void sendkeys(WebElement values, String a) {
		values.sendKeys(a);

	}

	public static void selectIndex(WebElement e, int i) {
		Select s = new Select(e);
		s.selectByIndex(i);

	}

	public static void selectvalue(WebElement e, String i) {
		Select s = new Select(e);
		s.selectByValue(i);
	}

	public static void selectvisibletext(WebElement e, String a) {
		Select s = new Select(e);
		s.selectByVisibleText(a);

	}
//Alert

	public static void alert_Accept(WebDriver e) {
		Alert a = e.switchTo().alert();
		a.accept();

	}

	public static void alert_Dismiss(WebDriver e) {
		Alert a = e.switchTo().alert();
		a.dismiss();
	}

	public static void alert_Sendkeys(WebDriver e, String b) {
		Alert a = e.switchTo().alert();
		a.sendKeys(b);

	}

	public static void alert_Gettext(WebDriver e) {
		Alert a = e.switchTo().alert();
		a.getText();

	}

	// Actions

	public static void rightclick(WebDriver e, WebElement a) {
		Actions b = new Actions(e);
		b.contextClick(a).build().perform();

	}

	public static void left_Click(WebDriver e, WebElement a) {
		Actions c = new Actions(e);
		c.click(a).build().perform();

	}

	public static void down() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	public static void enter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}

	public static void timeouts(WebDriver e, int s) {
		e.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));

	}

	public static void js(WebElement refname, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollintoview()", refname);
		js.executeScript("arguments[0].scrollIntoView()", refname);
	}

	
	
	

}
