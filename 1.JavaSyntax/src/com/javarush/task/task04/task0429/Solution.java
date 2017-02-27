package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int[] array = {a, b, c};
        int iPos = 0;
        int iNeg = 0;
        for (int elem : array){
            if (elem > 0) iPos++;
            else
                if (elem < 0) iNeg++;
        }
        System.out.println("количество отрицательных чисел: " + iNeg);
        System.out.println("количество положительных чисел: " + iPos);
    }
}
