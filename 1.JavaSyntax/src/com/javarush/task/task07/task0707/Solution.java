package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            list.add("String_" + i);
        }
        System.out.println(list.size());

        for (String elem: list){
            System.out.println(elem);
        }
    }
}
