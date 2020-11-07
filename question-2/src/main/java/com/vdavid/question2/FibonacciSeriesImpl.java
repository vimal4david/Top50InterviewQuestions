package com.vdavid.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FibonacciSeriesImpl implements FibonacciSeries {

  @Override
  public List<Integer> getFibonacciSeriesNthNumber(int nthNumber) {
    List<Integer> result = new ArrayList<>(Collections.singletonList(0));

    if (nthNumber == 1) {
      return result;
    }
    result.add(1);
    if (nthNumber == 2) {
      return result;
    }
    int fibo1 = 0;
    int fibo2 = 1;
    int fibonacci;
    for (int i = 3; i <= nthNumber; i++) {
      fibonacci = fibo1 + fibo2;
      result.add(fibonacci);
      fibo1 = fibo2;
      fibo2 = fibonacci;
    }
    return result;
  }
}
