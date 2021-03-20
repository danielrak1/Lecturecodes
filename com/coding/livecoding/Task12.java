package com.coding.livecoding;
//Write an application that reads a text from
// the user (type String) and counts a percentage
// of occurrences of a space character

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        double length = 0;
        String text = scanner.nextLine();
//        String textToLowerCase = text.toLowerCase();

        for( int i = 0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(ch==32){
                length++;
            }
        }
        double percentOfText = (length/text.length());


        System.out.println("Percentage of occurrences of a space character: " +
                + (Math.floor(percentOfText*100)) + "%");

    }

}
