package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayInt = new int[20];
        int[] arrayIntSmallOne = new int[10];
        int[] arrayIntSmallTwo = new int[10];

        for (int i = 0; i < arrayInt.length; i++){
            arrayInt[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < arrayInt.length / 2; i++){
            arrayIntSmallOne[i] = arrayInt[i];
            arrayIntSmallTwo[i] = arrayInt[i + 10];
        }

        for (int elem : arrayIntSmallTwo){
            System.out.println(elem);
        }

    }
}
