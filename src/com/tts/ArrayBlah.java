package com.tts;
import java.util.Arrays;
import java.lang.Math;



public class ArrayBlah {
        public static void main(String[] args) {
            int size = 5;
            int power = 3;
            int [] result = toPower(size, power);
        }

        public static int[] toPower(int size, int power) {
            int [] result = new int[size];
            for (int i = 0; i < size; i++) {
                result[i] = (int) Math.pow(i, power);
            }
            System.out.print(Arrays.toString(result));
            return result;
        }
    }


