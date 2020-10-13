package com.vdavid.question1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzImplTest {

  private static final String BIZZ = "Buzz";
  private static final String FIZZ = "Fizz";
  private static final String FIZZBIZZ = "FizzBuzz";

  private FizzBuzzImpl underTest;

  @BeforeEach
  public void setUp() {
    underTest = new FizzBuzzImpl();
  }

  @Test
  void shouldReturnNumberWhenNotMultipleOf3Or5() {

    // given
    int number = 1;

    // when
    final String actual = underTest.transform(number);

    // then
    final String expected = String.valueOf(number);
    assertEquals(expected, actual);
  }

  @Test
  void shouldReturnFizzForMultipleOf3() {

    // given
    int number = 3;

    // when
    final String actual = underTest.transform(number);

    // then
    assertEquals(FIZZ, actual);
  }

  @Test
  void shouldReturnBuzzForMultipleOf5() {

    // given
    int number = 5;

    // when
    final String actual = underTest.transform(number);

    // then
    assertEquals(BIZZ, actual);
  }

  @Test
  void shouldReturnFizzBuzzForMultipleOf3And5() {

    // given
    int number = 15;

    // when
    final String actual = underTest.transform(number);

    // then
    assertEquals(FIZZBIZZ, actual);
  }
}
