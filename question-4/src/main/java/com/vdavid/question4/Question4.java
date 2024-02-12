package com.vdavid.question4;

public class Question4 {
  public static void main(String[] args) {
    PrimeNumberImpl primeNumber = new PrimeNumberImpl();
    System.out.println("Question 4");
    for(int i=0; i<=20; i++) {
      primeNumber.isPrime(i);
    }
  }
}
