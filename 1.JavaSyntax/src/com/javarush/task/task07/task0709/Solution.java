package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++){
            String str = reader.readLine();
            list.add(str);
            if (str.length() < minLength)
                minLength = str.length();
        }

        for (String elem : list){
            if (elem.length() == minLength)
                System.out.println(elem);

        }
    }
}
