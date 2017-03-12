package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            map.put("Ivanov_" + i, "Ivan_" + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int i = 0;
        for (Map.Entry pair : map.entrySet()){
            if (pair.getValue().equals(name)) i++;
        }
        return i;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int i = 0;
        for (Map.Entry pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) i++;
        }
         return i;
    }

    public static void main(String[] args) {


    }
}
