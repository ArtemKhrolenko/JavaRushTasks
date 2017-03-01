package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String tmp;
        while (true){
            tmp = reader.readLine();
            if (tmp.equals("сумма")) break;
            sum += Integer.parseInt(tmp);

        }
        System.out.println(sum);
    }
}
