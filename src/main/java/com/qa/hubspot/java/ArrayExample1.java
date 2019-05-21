/**
 * Practicing by b to the a to the l to the a to the j to the i
 */
package com.qa.hubspot.java;

import java.util.Arrays;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declares an array of integers
		int[] num1 = new int[5];
		int[] num2 = { 6, 7, 8, 9, 10 };
		int[] num3 = new int[] { 11, 12, 13, 14, 15 };

		// index starts with 0
		num1[0] = 1;
		num1[1] = 2;
		num1[2] = 3;
		num1[3] = 4;
		num1[4] = 5;

		// print array
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
		System.out.println(Arrays.toString(num3));

		String[] str1 = new String[5];
		String[] str2 = { "x", "y", "z", "a", "b" };
		String[] str3 = new String[] { "a", "b", "c", "d", "e" };

		str1[0] = "a";
		str1[1] = "b";
		str1[2] = "c";
		str1[3] = "d";
		str1[4] = "e";

		System.out.println(Arrays.toString(str1));
		System.out.println(Arrays.toString(str2));
		System.out.println(Arrays.toString(str3));

	}

}
