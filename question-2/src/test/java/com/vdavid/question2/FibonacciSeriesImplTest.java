package com.vdavid.question2;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FibonacciSeriesImplTest {

  private FibonacciSeriesImpl underTest;

  @BeforeEach
  public void setUp() {
    underTest = new FibonacciSeriesImpl();
  }

  @Test
  void returnEmptyListWhenLastNumberIsZero() {
    // when
    int lastNumber = 0;

    // then
    final List<Integer> actual = underTest.getFibonacciSeriesUntilNumber(lastNumber);

    // give
    final List<Integer> expected = Collections.emptyList();
    assertIterableEquals(expected, actual);
  }

  @Test
  void returnListWithOnesWhenLastNumberIsOne() {
    // when
    int lastNumber = 1;

    // then
    final List<Integer> actual = underTest.getFibonacciSeriesUntilNumber(lastNumber);

    // give
    final List<Integer> expected = Arrays.asList(1, 1);
    assertIterableEquals(expected, actual);
  }

  @Test
  void returnFirstThreeNumbersWhenLastNumberIsTwo() {
    // when
    int lastNumber = 2;

    // then
    final List<Integer> actual = underTest.getFibonacciSeriesUntilNumber(lastNumber);

    // give
    final List<Integer> expected = Arrays.asList(1, 1, 2);
    assertIterableEquals(expected, actual);
  }

  @Test
  void returnFibonacciSeriesUpto12NosWhenLastNumberIs144() {
    // when
    int lastNumber = 144;

    // then
    final List<Integer> actual = underTest.getFibonacciSeriesUntilNumber(lastNumber);

    // give
    final List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);
    assertIterableEquals(expected, actual);
  }
}
