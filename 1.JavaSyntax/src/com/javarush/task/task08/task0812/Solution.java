package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader resder = new BufferedReader(new InputStreamReader(System.in));
        int repeat = 0;
        int maxRepeat = repeat;
        for (int i = 0; i < 10; i++){
            int elem = Integer.parseInt(resder.readLine());
            list.add(elem);
            if (i > 0 && list.get(i - 1) != elem){
                repeat = 0;
            }
            repeat++;
            if (repeat > maxRepeat) maxRepeat = repeat;
        }
        System.out.println(maxRepeat);


    }
}