package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int aDevideTen = a/10;

        boolean isEven = a % 2 == 0;
        boolean isOneSign = aDevideTen == 0;
        boolean isTwoSign = aDevideTen > 0 && aDevideTen < 10;
        boolean isThreeSign = aDevideTen >= 10 && aDevideTen < 100;

        if (a >= 1 && a <= 999){
            if (isEven && isOneSign) System.out.println("четное однозначное число");        else
                if (!isEven && isOneSign) System.out.println("нечетное однозначное число");     else
                    if (isEven && isTwoSign) System.out.println("четное двузначное число");         else
                        if (!isEven && isTwoSign) System.out.println("нечетное двузначное число");      else
                            if (isEven && isThreeSign) System.out.println("четное трехзначное число");      else
                                 if (!isEven && isThreeSign) System.out.println("нечетное трехзначное число");

        }

    }
}
