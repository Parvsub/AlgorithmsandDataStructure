package com.algorithm;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AnagramProblem {
    public void Anagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check if length is same
        if(str1.length() == str2.length()){

            // convert strings to char array
            char[] charsArray1 = str1.toCharArray();
            char[] charsArray2 = str2.toCharArray();

            //sort the char array
            Arrays.sort(charsArray1);
            Arrays.sort(charsArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charsArray1,charsArray2);

            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
    }

    public static void main(String[] args) {
        AnagramProblem anagramProblem = new AnagramProblem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two strings:");
        String str1 = scanner.next();
        String str2 = scanner.next();
        anagramProblem.Anagram(str1,str2);
    }
}
