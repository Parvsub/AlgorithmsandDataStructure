package com.algorithm;

public class PrimeNumber {

        public static void main(String[] args) {
            int range = 1000;
            boolean isPrime;
            for (int i = 2; i <= range; i++) {
                isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }









