package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        return (this.age > anotherCat.age && this.weight > anotherCat.weight && this.strength > anotherCat.strength);
    }

    public static void main(String[] args) {

    }
}
