package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        double tmp = a % 5;
        if (tmp >= 0 && tmp < 3 )
            System.out.println("зелёный");
        if (tmp >= 3 && tmp < 4)
            System.out.println("желтый");
        if (tmp >= 4 && tmp < 5)
            System.out.println("красный");
    }
}