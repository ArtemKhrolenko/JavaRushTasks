package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children = new ArrayList<Human>();
        ArrayList<Human> childrenGranPa = new ArrayList<>();
        ArrayList<Human> childrenGranMa = new ArrayList<>();

        Human child1 = new Human("child1", true, 12, new ArrayList<Human>());
        children.add(child1);

        Human child2 = new Human("child2", true, 13, new ArrayList<Human>());
        children.add(child2);

        Human child3 = new Human("child3", true, 10, new ArrayList<Human>());
        children.add(child3);

        Human father = new Human("papa Kolya", true, 35, children);
        childrenGranPa.add(father);

        Human mother = new Human("mama Valya", false, 30, children);
        childrenGranMa.add(mother);


        Human ded1 = new Human("ded vova", true, 75, childrenGranPa);
        Human ded2 = new Human("ded Vasya", true, 84, childrenGranMa);
        Human baba1 = new Human("baba Sveta", false, 74, childrenGranPa);
        Human baba2 = new Human("baba Dusya", false, 65, childrenGranMa);


        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children ;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
