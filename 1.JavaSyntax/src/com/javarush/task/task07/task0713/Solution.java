package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listSource = new ArrayList<>();
        ArrayList<Integer> listThree = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        ArrayList<Integer> listOthers = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            listSource.add(Integer.parseInt(reader.readLine()));
        }

        for (int elem: listSource){
            if (elem % 3 != 0 && elem % 2 != 0){
                listOthers.add(elem);
            }
            else {
                if (elem % 3 == 0)
                    listThree.add(elem);
                if (elem % 2 == 0)
                    listTwo.add(elem);
            }

        }

        printList(listThree);
        printList(listTwo);
        printList(listOthers);


    }

    public static void printList(List<Integer> list) {
        for (int elem : list){
            System.out.println(elem);
        }
    }
}
