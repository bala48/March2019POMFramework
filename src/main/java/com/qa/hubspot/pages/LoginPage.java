/**
 * Practicing by b to the a to the l to the a to the j to the i
 */
package com.qa.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.hubspot.base.BasePage;

public class LoginPage extends BasePage {

	WebDriver driver;

	// 1. Defining page objects with the help of page factory or By LOCATORS::
	// 2. page actions/methods for the above objects/features::

	// 1a. Defining page objects::

	@FindBy(id = "username")
	WebElement emailid;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "loginBtn")
	WebElement loginButton;

	@FindBy(linkText = "Sign up")
	WebElement signUpLink;

	// 1b. create a constructor of a page class and initialize all the page objects
	// with driver::

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// 2. defining our actions/methods

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean verifySignUpLink() {
		return signUpLink.isDisplayed();
	}

	public HomePage doLogin(String un, String pwd) {
		System.out.println("un and pwd are ::  " + un + " " + pwd);
		emailid.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage(driver);

	}
}
