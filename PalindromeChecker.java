package com.tka;

public class PalindromeChecker {
    public static void main(String[] args) {
        String word = "madam";
        boolean isPalindrome = isPalindrome(word);
        System.out.println(word + " is palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
