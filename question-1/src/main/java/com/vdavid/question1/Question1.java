package com.vdavid.question1;

// Write a short program that prints each number from 1 to 100 on a new line.For each multiple of 3,
// print "Fizz" instead of the number.For each multiple of 5, print "Buzz" instead of the number.
// For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.

import java.util.stream.IntStream;

public class Question1 {

  public static void main(String[] args) {

    System.out.println("Question 1");
    // print 1 to 100 on a new line
    FizzBuzzImpl fizzBuzz = new FizzBuzzImpl();
    IntStream.rangeClosed(1, 100)
        .mapToObj(fizzBuzz::transform)
        .forEach(System.out::println);
  }
}
