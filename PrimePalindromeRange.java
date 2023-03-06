package com.algorithm;

public class PrimePalindromeRange {
    public void displayPrimePalindrome() {
        int count = 0;
        for (int i = 10; i <= 1000; i++) {
            int num = i;
            int reverseNumber = 0;
            while (num != 0) {
                int digit = num % 10;
                num = num / 10;
                reverseNumber = reverseNumber * 10 + digit;
            }
            if (reverseNumber == i) {
                boolean isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(i + " ");
                    count++;
                    if (count == 10) {
                        System.out.println();
                        count = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        PrimePalindromeRange palindromeRange = new PrimePalindromeRange();
        palindromeRange.displayPrimePalindrome();
    }
}