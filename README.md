# String Calculator TDD Assessment

# This is a Simple String Calculator

# The program can take unknown amount of numbers with different delimiters and return their sum.

# Features used:

## 1) Stream API for parallel processing to calculate the Sum of numbers

## 1) Pattern Matching

# Test Cases:

## testAddEmptyString()
// Empty String

## testAddOneNumberString()
// String containing only one number

## testAddTwoNumbersString()
// String containing two numbers separated by comma

## testAddCommaSeperatedNumbersString()
// String containing "n" amount of numbers separated by comma

## testAddStringWithoutNumber()
// String containing only one Character which is not an Integer

## testAddStringWithCustomDelimiterAsterisk()
// String with custom delimiter "*"

## testAddStringWithCustomDelimiterColon()
// String with custom delimiter ":"

## testAddStringWithCustomDelimiterSemiColon()
// String with custom delimiter ";"

## testAddMultipleNumbersStringWithEmptyStringsInBetween()
// String containing numbers and empty strings in between

## testAddStringWithNegativeNumbers()
// String containing negative numbers (Test case fails since we are throwing Exception)

## testAddStringContainingNumbersGreaterThanThousand()
// Numbers bigger than 1000 are ignored
