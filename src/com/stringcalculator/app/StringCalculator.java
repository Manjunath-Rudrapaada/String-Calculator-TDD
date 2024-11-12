package com.stringcalculator.app;

public class StringCalculator {
	
	public int add(String inputString) {
		
		if (inputString.isEmpty()) {
			return 0;
		}
		
		if (inputString.length() == 1) {
			return parseSingleNumberInput(inputString);
		}
		
		int sum = 0;
		
		String[] arr = inputString.split(",");
		
		for (String str: arr) {
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
