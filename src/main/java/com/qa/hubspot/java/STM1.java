/**
 * Practicing by b to the a to the l to the a to the j to the i
 */
package com.qa.hubspot.java;

public class STM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "murali1234";
		s = s.replaceAll("[^0-9]", ""); 
		System.out.println(s);
		 

	/*	char[] ch = s.toCharArray();
		for (Character c : ch) {
			if (Character.isDigit(c))
				System.out.println(c);*/
		}
	}
