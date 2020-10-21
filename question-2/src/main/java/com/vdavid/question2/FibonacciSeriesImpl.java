package com.vdavid.question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FibonacciSeriesImpl implements FibonacciSeries {

  @Override
  public List<Integer> getFibonacciSeriesUntilNumber(int lastNumber) {
    ArrayList<Integer> result = new ArrayList<>(Arrays.asList(1, 1));

    if (lastNumber == 0) {
      return Collections.emptyList();
    }
    if (lastNumber == 1) {
      return result;
    }
    int fibo1 = 1;
    int fibo2 = 1;
    int fibonacci = 0;
    while (fibonacci < lastNumber) {
      fibonacci = fibo1 + fibo2;
      result.add(fibonacci);
      fibo1 = fibo2;
      fibo2 = fibonacci;
    }
    return result;
  }
}
