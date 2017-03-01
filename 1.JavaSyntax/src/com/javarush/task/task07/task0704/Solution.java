package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayInt = new int[10];

        for (int i = 0; i < arrayInt.length; i++){
            arrayInt[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < arrayInt.length / 2; i++){
            int tmp = arrayInt[i];
            arrayInt[i] = arrayInt[arrayInt.length - 1 - i];
            arrayInt[arrayInt.length - 1 - i] = tmp;
        }

        for (int elem : arrayInt){
            System.out.println(elem);

        }

    }
}

