package com.vdavid.question6;

public class Question6 {
  public static void main(String[] args) {
    CheckForVowelImpl checkForVowel = new CheckForVowelImpl();
    System.out.println("Question 5");
    checkForVowel.containsVowel("Vowel");
    checkForVowel.containsVowel("qwrtyypsdfghjklzxcvbnm");
  }
}
