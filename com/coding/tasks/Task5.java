package com.coding.tasks;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 4, 3};
        int[] myNewArray = eliminateDuplicates(myArray);
        for (int n : myNewArray){
            System.out.print(n + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list){
        int[] uniques = new int[list.length];
        int currenctIndex =0;
        for(int i=0; i< list.length; i++){
            boolean isUnique = true;
            for(int j = 0; j<=currenctIndex; j++){
                if(list[i]==uniques[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                uniques[currenctIndex] = list[i];
                currenctIndex++;
            }
        }
return Arrays.copyOf(uniques, currenctIndex);
    }
}
