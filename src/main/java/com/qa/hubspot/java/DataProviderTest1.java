/**
 * Practicing by b to the a to the l to the a to the j to the i
 */
package com.qa.hubspot.java;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest1 {

	// Declare Test annotation with attribute dataProvider and value "getData".
	@Test(dataProvider = "getData")
	public void setData(String name, String rollNo) {
		System.out.println("In to Test annotation");
		System.out.println("Name: " + name);
		System.out.println("RollNo: " + rollNo);
	}

	// Declare DataProvider annotation with attribute name and value "getData".
	@DataProvider(name = "getData")
	// Declare a method whose return type is an array of object.
	public Object[][] dataProviderMethod() {

		// Create an object of an array object and declare parameters 3 and 2.
		// 3 represents number of times your test has to be repeated.
		// 2 represents number of parameters in test data. Here, we are providing two
		// parameters.
		Object[][] data = new Object[3][2];

		// 1st row.
		data[0][0] = "John";
		data[0][1] = "23";
		// 2nd row.
		data[1][0] = "Sanjana";
		data[1][1] = "40";
		// 3rd row.
		data[2][0] = "Deep";
		data[2][1] = "01";
		return data;
	}
}