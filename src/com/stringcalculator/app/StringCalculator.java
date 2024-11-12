package com.stringcalculator.app;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculator {
	
	public int add(String inputString) {
		
		if (inputString.isEmpty()) {
			return 0;
		}
		
		if (inputString.length() == 1) {
			return parseSingleNumberInput(inputString);
		}
		
		String[] numberStrings = checkForCustomDelimiterAndSplitTheString(inputString);
		
		List<String> nonEmptyNumberStrings = checkForEmptyString(numberStrings);
		
		return calculateSum(nonEmptyNumberStrings);
	}
	
	private int parseSingleNumberInput(String inputString) {
		if (!inputString.matches("\\d+")) { // regex to check if string contains number or a character
			System.out.println("Invalid Input :" + inputString);
			return -1;
		}
		
		return Integer.parseInt(inputString);
	}
	
	private List<String> checkForEmptyString(String[] nums) {
		return Arrays.stream(nums) 
				.filter(num -> !num.isEmpty())
				.collect(Collectors.toList());
	}
	
	private String[] checkForCustomDelimiterAndSplitTheString(String inputString) {
		String delimiter = ",|\\n";
		
		if (inputString.startsWith("//")) {
			int delimiterPatternEndIndex = inputString.indexOf("\n");
			delimiter = Pattern.quote(inputString.substring(2, delimiterPatternEndIndex));
			inputString = inputString.substring(delimiterPatternEndIndex + 1);
		}
		
		String[] nums = inputString.split(delimiter);
		return nums;
	}
	
	private int calculateSum(List<String> nonEmptyNumberStrings) {
		return nonEmptyNumberStrings.stream()
				.mapToInt(Integer::parseInt)
				.sum();
	}
	
}
