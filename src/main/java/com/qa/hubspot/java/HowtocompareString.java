/**
 * Practicing by b to the a to the l to the a to the j to the i
 */
package com.qa.hubspot.java;

public class HowtocompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "mkyong";

		if ("mkyong".equals(name)) {
			System.out.println("Yes");
			
			String name1 = "hello";
			String name2 = "HELLO";

			//if (name1.equals(name2)) {
			if (name1.equalsIgnoreCase(name2)) {
				System.out.println("Yes");
			} else {
				System.out.printf("NO, equals is case sensitive!");
			}
		}

	}

}
