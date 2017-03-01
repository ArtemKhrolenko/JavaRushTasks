package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name, color, address;
    int age, weight;

    public Cat(String name){
        this.name = name;
        this.color = "red";
        this.age = 15;
        this.weight = 30;
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight == 0 ? 45 : weight;
        this.age = age == 0 ? 15 : age;
        this.color = "red";


    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age == 0 ? 15 : age;
        this.color = "red";
        this.weight = 2;

    }

    public Cat(int weight, String color){
        this.weight =  weight == 0 ? 15 : weight;
        this.color = color;
        this.age = 45;

    }

    public Cat(int weight, String color, String address){
        this.weight = weight == 0 ? 15 : weight;
        this.address = address;
        this.color = color;
        this.age = 45;

    }



    public static void main(String[] args) {

    }
}
