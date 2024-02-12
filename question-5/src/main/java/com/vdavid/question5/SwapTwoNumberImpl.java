package com.vdavid.question5;

//b = b + a; // now b is sum of both the numbers
//a = b - a; // b - a = (b + a) - a = b (a is swapped)
//b = b - a; // (b + a) - b = a (b is swapped)
public class SwapTwoNumberImpl implements SwapTwoNumber {
    @Override
    public void swap() {
        int a = 10;
        int b = 20;

        System.out.println("Numbers before swap A: " + a + " B: " +b);

        b = b + a;
        a = b - a;
        b = b - a;

        System.out.println("Numbers after swap A: " + a + " B: " +b);
    }
}
