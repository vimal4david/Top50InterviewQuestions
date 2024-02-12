package com.vdavid.question6;

public class CheckForVowelImpl implements CheckForVowel {
    @Override
    public boolean containsVowel(String input) {
        System.out.println("Checking for vowel in string : " + input);
        boolean result = input.toLowerCase().matches(".*[aeiou].*");
        System.out.println(input + " string " + (result ? "":"doesn't ") + "contains vowel");
        return result;
    }
}
