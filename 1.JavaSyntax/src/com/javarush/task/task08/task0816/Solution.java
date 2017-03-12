package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone_1", new Date("JANUARY 1 1980"));
        map.put("Stallone_2", new Date("OCTOBER 1 1980"));
        map.put("Stallone_3", new Date("JUNE 1 1980"));
        map.put("Stallone_4", new Date("JUNE 1 1980"));
        map.put("Stallone_5", new Date("JUNE 1 1980"));
        map.put("Stallone_6", new Date("JUNE 1 1980"));
        map.put("Stallone_7", new Date("JUNE 1 1980"));
        map.put("Stallone_8", new Date("JUNE 1 1980"));
        map.put("Stallone_9", new Date("JUNE 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String,Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String,Date> entry = iter.next();
            if (entry.getValue().getMonth() >= 5 && entry.getValue().getMonth() <=7){
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {
        {

        }

    }
}
