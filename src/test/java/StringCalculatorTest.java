package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.stringcalculator.app.StringCalculator;

public class StringCalculatorTest {
	
	@Test
	void testAddEmptyString() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(0, stringCalculator.add(""));
	}
	
	@Test
	void testAddOneNumberString() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(23, stringCalculator.add("23"));
	}
	
	@Test
	void testAddTwoNumbersString() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(32, stringCalculator.add("23,9"));
	}
	
	@Test
	void testAddCommaSeperatedNumbersString() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(53, stringCalculator.add("23,17,9,4"));
	}
	
	@Test
	void testAddStringWithoutNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(-1, stringCalculator.add("s"));
	}
	
	@Test
	void testAddStringWithNewLineDelimiter() { 
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(21, stringCalculator.add("1,2,3\n4\n5,6"));
	}
	
	@Test
	void testAddStringWithCustomDelimiterAsterisk() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(10, stringCalculator.add("//*\n1*2*3*4"));
	}

	@Test
	void testAddStringWithCustomDelimiterColon() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(15, stringCalculator.add("//:\n1:2:3:4:5"));
	}

	@Test
	void testAddStringWithCustomDelimiterSemiColon() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(15, stringCalculator.add("//;\n1;2;3;4;5"));
	}

}
