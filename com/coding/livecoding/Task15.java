package com.coding.livecoding;

//Write an application that reads  from the user 10 arbitrarily
// large numbers (variables of type int) and prints those that
// occurred at least twice.

import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int[] array = inputArray();
        printDuplicateNumber(array);

    }
    private static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        for(int i =0; i<array.length; i++){
            array[i]= sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Entered array: " + Arrays.toString(array));
        return array;
    }

    private static void printDuplicateNumber(int[] array) {
        for(int i = 1; i< array.length; i++){
            if(array[i] == array[i-1]){
                System.out.println("Duplicate: " + array[i]);
            }
        }
    }

}

