package com.tts;



public class Main {

    public static void main(String[] args) {
        int myArray[] = {7, 3, 12, 9, 15};
        int sum = 0;
        for (int num : myArray) {
            sum = sum + num;
        }
        System.out.println("The sum of this array is: " + sum);
    }
}
