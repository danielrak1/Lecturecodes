package com.coding.task10;

public class Main10 {
    public static void main(String[] args) {

        double[] nums = generateRandomNumArrays();

        Stopwatch sw = new Stopwatch();
        sw.start();
        selectionSort(nums);
        sw.stop();
        System.out.println("Execution is done in: " + sw.getElapsedtime() + " ms");

        }

    private static void selectionSort(double[] nums) {
        for(int i = nums.length-1; i>=0; i--){
            double largest = nums[0];
            int index = 0;
            for( int j=0; j<=i; j++){
                if(nums[j] > largest){
                    largest= nums[j];
                    index = j;
                }
            }
            double temp = nums[i];
            nums[i] = nums[index];
            nums[index]=temp;
            }
    }

    private static double[] generateRandomNumArrays() {
        double[] nums = new double[100_000];
        for (int i=0; i<nums.length; i++){
            nums[i] = Math.random()*100_000;
        }
        return nums;
    }
}

