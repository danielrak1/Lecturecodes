package com.coding.livecoding;

//Write an application that takes a positive
// number from the user (type int) and prints
// all prime numbers greater than 1 and less
// than the given number.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int i, j, flag;
        for( i =1; i<=input; i++){

            // Skip 0 and 1 as they are
            // neither prime nor composite
            if(i==1 || i==0)
                continue;
            // flag variable to tell
            // if i is prime or not
            flag =1;
            for(j=2; j<=i/2; j++){
                if(i%j ==0){
                    flag = 0;
                    break;
                }
            }
            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if(flag==1)
            System.out.println(i + " ");
        }
    }
}
