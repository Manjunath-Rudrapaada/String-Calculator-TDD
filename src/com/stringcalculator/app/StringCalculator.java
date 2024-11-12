package com.stringcalculator.app;

public class StringCalculator {
	
	public int add(String numbers) {
		int sum = 0;
		
		String[] arr = numbers.split(",");
		
		for (String str: arr) {
			sum += Integer.parseInt(str);
		}
		
		return sum;
	}
	
}
