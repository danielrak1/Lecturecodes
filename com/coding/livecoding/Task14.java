package com.coding.livecoding;

//Write an application that reads two lowercase letters of the
// Latin alphabet (type char) and calculates how many characters
// is there in the alphabet between given letters.
// Hint - use the ASCII code table and treat the characters as int numbers.

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two lowercase letters: ");
        char char1 = sc.next().charAt(0);
        char char2 = sc.next().charAt(0);
        sc.close();

        int a = char1-0;
        int b = char2-0;

        System.out.println("ASCII values: " + char1 + "=" + a + " " +
                char2 + "=" + b);

        printCharDifference(a, b);


    }

    private static void printCharDifference(int a, int b) {
        if(a > b){
            System.out.println("There are: " + (a - b -1) + " characters in the alphabet" +
                    " between two input letters");
        }else{
            System.out.println("There are: " + (b - a -1) + " characters in the alphabet" +
                    " between two input letters");
        }
    }
}
