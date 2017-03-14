package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            map.put("Surname_" + i, "Name_" + i);
        }
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        ArrayList<String> list = new ArrayList<String>();

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            list.add(iterator.next().getValue());


            //removeItemFromMapByValue(map, iterator.next().getValue());
        }

        for (int i = 0; i < list.size()-1; i++){
            for (int j = i+1; j < list.size(); j++){
                if (list.get(i) == list.get(j)) removeItemFromMapByValue(map, list.get(i));
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
