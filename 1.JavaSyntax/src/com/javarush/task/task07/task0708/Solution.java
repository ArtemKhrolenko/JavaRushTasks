package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        int maxLength = 0;
        for (int i = 0; i < 5; i++){
            String str = reader.readLine();
            list.add(str);
            if (str.length() > maxLength)
                maxLength = str.length();
        }

        for (String elem : list){
            if (elem.length() == maxLength)
                System.out.println(elem);

        }


    }
}
