package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat ca1 = new Cat("cat1", 5, 5, 5);
        Cat ca2 = new Cat("cat2", 5, 5, 5);
        Cat ca3 = new Cat("cat3", 5, 5, 5);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}