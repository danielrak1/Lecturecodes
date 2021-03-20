package com.coding.livecoding;
/*Write an application that will read texts
(variables of the String type) until the user gives
the text "Enough!" and then writes the longest of the
given texts (not including the text "Enough!").
If the user does not provide any text, write "No text provided"
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list= new ArrayList<String>();
        String text = "";


        do{
           text = scanner.next();
           list.add(text);

        }while(!text.equals("Enough!"));
            list.remove("Enough!");


        int largestString = list.get(0).length();
        int index=0 ;
        for(int i =0; i<list.size(); i++){
            if(list.get(i).length()>largestString){
                largestString = list.get(i).length();
                index = i;
            }
        }
        System.out.println("Index: " + index + " '" + list.get(index)
        + " '" + "is the largest and its size is  " + largestString +
                " letters");

    }
}
