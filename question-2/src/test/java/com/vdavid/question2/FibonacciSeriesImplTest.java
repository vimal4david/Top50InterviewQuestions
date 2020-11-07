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
  void returnSingletonListWhenNthTermIsOne() {
    // when
    int nthTerm = 1;

    // then
    final List<Integer> actual = underTest.getFibonacciSeriesNthNumber(nthTerm);

    // give
    final List<Integer> expected = Collections.singletonList(0);
    assertIterableEquals(expected, actual);
  }

  @Test
  void returnListWithZeroAndOneWhenNthTermIsTwo() {
    // when
    int nthTerm = 2;

    // then
    final List<Integer> actual = underTest.getFibonacciSeriesNthNumber(nthTerm);

    // give
    final List<Integer> expected = Arrays.asList(0, 1);
    assertIterableEquals(expected, actual);
  }

  @Test
  void returnFirstThreeFibonacciNumbersWhenNthTermIsThree() {
    // when
    int nthTerm = 3;

    // then
    final List<Integer> actual = underTest.getFibonacciSeriesNthNumber(nthTerm);

    // give
    final List<Integer> expected = Arrays.asList(0, 1, 1);
    assertIterableEquals(expected, actual);
  }

  @Test
  void returnFibonacciSeriesUpto12NosWhenNthTermIs12() {
    // when
    int lastNumber = 12;

    // then
    final List<Integer> actual = underTest.getFibonacciSeriesNthNumber(lastNumber);

    // give
    final List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
    assertIterableEquals(expected, actual);
  }
}
