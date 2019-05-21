/**
 * Practicing by b to the a to the l to the a to the j to the i
 */
package com.qa.hubspot.java;

import java.util.Arrays;
import java.util.List;

public class Java8Stream {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = integers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Total : " + sum);

	}

}
