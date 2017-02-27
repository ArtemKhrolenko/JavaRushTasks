package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Syear = reader.readLine();

        int Nyear = Integer.parseInt(Syear);
        int days;
        if (Nyear % 4 == 0)
        {
            days = 366;
            if ((Nyear % 100 == 0 ) && (Nyear % 400 != 0))
                days = 365;
        }
        else days = 365;

        System.out.println("количество дней в году: " + days);
    }
}