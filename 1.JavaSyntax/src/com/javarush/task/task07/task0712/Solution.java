package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++){
            String str = reader.readLine();
            list.add(str);
            if (str.length() > maxLength)
                maxLength = str.length();
            if (str.length() < minLength)
                minLength = str.length();

        }

        for (String elem : list){
            if (elem.length() == maxLength || elem.length() == minLength){
                System.out.println(elem);
                break;
            }


        }

    }
}
