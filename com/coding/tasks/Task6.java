package com.coding.tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int[] scores = initialize();

        int best = findBestScore(scores);

        displayGrades(scores, best);
    }
    private static int[] initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();
        System.out.println("Enter " + numOfStudents + " grades: ");

        int [] scores = new int[numOfStudents];

        for(int i=0; i<scores.length; i++) {
            scores[i]=scanner.nextInt();
        }
        return scores;
    }

    private static int findBestScore(int[] scores) {
        int best = scores[0];
        for(int i = 1; i< scores.length; i++){
            if(scores[i] > best){
                best = scores[i];
            }
        }
        return best;
    }

    private static void displayGrades(int[] scores, int best) {
        for (int i = 0; i< scores.length; i++){
            char c;
            if(scores[i] >= best - 10){
                c = 'A';
            }else if(scores[i] >= best - 20){
                c = 'B';
        }else if(scores[i] >= best - 30){
                c = 'C';
            } else if(scores[i] >= best - 40){
            c = 'D';
        }else {
                c = 'F';
            }
            System.out.println("Student " + i + " scores is: " + scores[i]
            + " and grade is: " + c);
        }
    }




}
