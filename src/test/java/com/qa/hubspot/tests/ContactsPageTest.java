/**
 * Practicing by b to the a to the l to the a to the j to the i
 */
package com.qa.hubspot.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.hubspot.base.BasePage;
import com.qa.hubspot.pages.ContactsPage;
import com.qa.hubspot.pages.HomePage;
import com.qa.hubspot.pages.LoginPage;
import com.qa.hubspot.util.CommonUtil;
import com.qa.hubspot.util.ExcelUtil;

public class ContactsPageTest {

	BasePage basePage;
	WebDriver driver;
	Properties prop;
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;

	@BeforeMethod
	public void setUP() {
		basePage = new BasePage();
		prop = basePage.initilize_properties();
		driver = basePage.initilize_driver(prop);
		driver.get(prop.getProperty("url"));
		CommonUtil.longWait();

		loginPage = new LoginPage(driver);
		homePage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		CommonUtil.longWait();
		contactsPage = homePage.goToContactsPage();
	}

	@DataProvider(name = "getContactsData")
	public Object[][] getContactsTestData() {
		Object contactsData[][] = ExcelUtil.getTestData("contacts");
		return contactsData;
	}

	@Test(dataProvider = "getContactsData")
	public void createContactsTest(String email, String  firstName, String lastName, String jobTitle) {
		contactsPage.createNewContact(email, firstName, lastName, jobTitle);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
