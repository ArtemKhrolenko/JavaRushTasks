package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayInt = new int[15];

        for (int i = 0; i < arrayInt.length; i++){
            arrayInt[i] = Integer.parseInt(reader.readLine());
        }

        int even = 0, odd = 0;

        for (int i = 0; i < arrayInt.length; i++){
            even += i % 2 == 0 ? arrayInt[i] : 0;
            odd += i % 2  != 0 ? arrayInt[i] : 0;
        }
        if (even > odd) System.out.println("В домах с четными номерами проживает больше жителей."); else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
