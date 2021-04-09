package com.coding.livecoding;
//Write an application that will take a positive number from the user
// (type int) and draw a wave with a given length and height of 4 lines,
// according to the following example (fill empty spaces with spaces):

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        String [][] matrix = new String[3][input];

        boolean flag=true;
        for(int j =0; j < input; j=j+6){
            matrix[0][j]="*";
//            for()
                }

// print last row
        for (int j = 3; j < input; j = j + 6) {
            matrix[3][j] = "*";
        }

            }

        }
//            System.out.print(Arrays.toString(matrix));