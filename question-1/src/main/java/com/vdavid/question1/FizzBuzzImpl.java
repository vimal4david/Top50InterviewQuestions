package com.vdavid.question1;

public class FizzBuzzImpl implements FizzBuzz {

  private static final String BIZZ = "Buzz";
  private static final String FIZZ = "Fizz";
  private static final String FIZZBIZZ = "FizzBuzz";

  @Override
  public String transform(int number) {
    if (isMultipleOf5And3(number)) {
      return FIZZBIZZ;
    } else if (isMultipleOf3(number)) {
      return FIZZ;
    } else if (isMultipleOf5(number)) {
      return BIZZ;
    } else {
      return String.valueOf(number);
    }
  }

  private boolean isMultipleOf5(int number) {
    return number % 5 == 0;
  }

  private boolean isMultipleOf3(int number) {
    return number % 3 == 0;
  }

  private boolean isMultipleOf5And3(int number) {
    return isMultipleOf5(number) && isMultipleOf3(number);
  }
}
