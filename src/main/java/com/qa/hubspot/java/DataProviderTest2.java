/**
 * Practicing by b to the a to the l to the a to the j to the i
 */
package com.qa.hubspot.java;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest2 {

	@Test(dataProvider = "getData")
	public void setData(String username, String password) {
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	// Here, we are not declaring attribute "name" for DataProvider. So, it will use
	// the name of method or function.
	@DataProvider
	public Object[][] getData() {
		// You can also return data in this way. Here, we are using an anonymous concept
		// of Java to return data.
		return new Object[][] { { "DEEPAK", " 1234" }, { "AMIT", "12345" }, { "RASHMI", " 123456" }, { "balaji", "9876543210" } };
	}
}
