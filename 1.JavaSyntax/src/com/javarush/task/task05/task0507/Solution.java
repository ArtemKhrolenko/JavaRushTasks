package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int i = 0;
        int tmp;
        while (true){
            tmp = Integer.parseInt(reader.readLine());
            if (tmp == -1) break;
            sum += tmp;
            i++;
        }

        System.out.println((double) sum / i);

    }
}

