package com.vdavid.question3;

public class ReverseStringImpl implements ReverseString {
    @Override
    public String reverseString(String input) {

        if (input == null || input.isEmpty() || input.length() == 1) {
            return input;
        }

        StringBuilder result = new StringBuilder();

        char[] inputCharArray = input.toCharArray();
        for (int i = inputCharArray.length - 1; i >= 0; i--) {
            result.append(inputCharArray[i]);
        }
        return result.toString();
    }
}
