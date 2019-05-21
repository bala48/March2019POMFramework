/**
 * Practicing by b to the a to the l to the a to the j to the i
 */
package com.qa.hubspot.java;

public class JavaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "mkyong is learning Java 123";

		System.out.println(name.contains("Java")); // true
		System.out.println(name.contains("java")); // false
		System.out.println(name.contains("MKYONG")); // false
		System.out.println(name.contains("mkyong")); // true

		if (name.contains("Java")) {
			System.out.println("Hello Java");
		} else {
			System.out.println("abc...");
		}

	}

}
