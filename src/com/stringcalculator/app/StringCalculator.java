package com.stringcalculator.app;

import java.util.regex.Pattern;

public class StringCalculator {
	
	public int add(String inputString) {
		
		if (inputString.isEmpty()) {
			return 0;
		}
		
		if (inputString.length() == 1) {
			return parseSingleNumberInput(inputString);
		}
		
		int sum = 0;
		
		String delimiter = ",|\\n";

		if (inputString.startsWith("//")) {
			int delimiterPatternEndIndex = inputString.indexOf("\n");
			delimiter = Pattern.quote(inputString.substring(2, delimiterPatternEndIndex));
			inputString = inputString.substring(delimiterPatternEndIndex + 1);
		}

		String[] nums = inputString.split(delimiter);
		
		for (String str: nums) {
			sum += Integer.parseInt(str);
		}
		
		return sum;
	}
	
	private int parseSingleNumberInput(String inputString) {
		if (!inputString.matches("\\d+")) { // regex to check if string contains number or a character
			System.out.println("Invalid Input :" + inputString);
			return -1;
		}
		
		return Integer.parseInt(inputString);
	}
	
}
