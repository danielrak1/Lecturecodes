package com.coding.livecoding;

//Write an application that takes 10 numbers from the user
// (type int) and write the length of the longest such
// subsequence of these numbers, which is increasing.
// For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7"
// the program should write "5" as the length of the longest
// increasing subsequence (underlined in the example)

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int [10];
        for(int i=0; i<10; i++){
            array[i]= scanner.nextInt();
        }
        


    }
}
