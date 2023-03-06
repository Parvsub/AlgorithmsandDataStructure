package com.algorithm;

import java.util.Scanner;

public class MergeSort {
    public static void merge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements to sort");
        int noOfElements = scanner.nextInt();
        int[] array = new int[noOfElements];
        System.out.println("Enter array elements");
        for (int i = 0; i < noOfElements; i++) {
            array[i] = scanner.nextInt();
        }
        msort(array, 0, array.length - 1);
        for (int x:array){
            System.out.println(x );
        }
    }

    private static void msort(int[] array, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            msort(array, low, middle);
            msort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }

    private static void merge(int[] array, int low, int middle, int high) {
        int i = low;
        int j = middle+1;
        int k = low;

        int [] Arr = new int[array.length];

        while (i<=middle && j<=high){
            if(array[i] < array[j]){
                Arr[k] = array[i];
                i++;
                k++;
            }else
            {
               Arr[k] = array[j];
               j++;
               k++;
            }
        }
        while (i<=middle){
            Arr[k] = array[i];
            i++;
            k++;
        }
        for (i=low;i<=high;i++){
            array[i] = Arr[i];
        }
    }

    public static void main(String[] args) {
        merge();

    }
}
