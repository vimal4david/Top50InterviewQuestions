package com.vdavid.question4;

public class PrimeNumberImpl implements PrimeNumber {
    @Override
    public boolean isPrime(int number) {
        System.out.println("Checking whether given number: " + number + " is prime.");
        boolean flag = false;

        if (number == 0 || number==1) {
            flag = false;
        } else if(number == 2) {
            flag = true;
        } else if(number % 2 == 0) {
                flag = false;
        } else {
            for(int i=3; i<=number/2; i++) {
                if(number % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println("Number: "+ number + " is " + (flag ? "" : "not ") + "a prime number");
        return flag;
    }
}
