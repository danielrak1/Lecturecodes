package com.coding.tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();

        int [] scores = new int[numOfStudents];
        String[] names = new String[numOfStudents];

        for(int i=0; i<scores.length; i++) {
            System.out.println("Enter student name: ");
            names[i] = scanner.next();
            System.out.println("Enter score: ");
            scores[i]=scanner.nextInt();
        }
        sortDecreasing(names, scores);
        for( int i = 0; i< names.length; i++){
            System.out.println(names[i]);
        }
    }

    public static void sortDecreasing(String[] names, int[] scores){
        boolean flag = true;
        while(flag){
            flag=false;
            for(int i = 0; i< scores.length-1; i++){
                if(scores[i]<scores[i+1]){
                    flag=true;
                    int temp = scores[i+1];
                    scores[i+1] = scores[i];
                    scores[i] = temp;

                    String tempString = names[i+1];
                    names[i+1] = names[i];
                    names[i] = tempString;
                }
            }
        }
    }
}
