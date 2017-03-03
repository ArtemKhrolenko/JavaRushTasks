package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandPa1 = new Human("Ded_1", true, 85);
        Human grandPa2 = new Human("Ded_2", true, 80);

        Human grandMa1 = new Human("Baba_1", false, 80);
        Human grandMa2 = new Human("Baba_2", false, 84);

        Human father = new Human("Father", true, 35, grandPa1, grandMa1);
        Human mother = new Human("Mother", false, 33, grandPa2, grandMa2);

        Human child1 = new Human("Child1", false, 10, father, mother);
        Human child2 = new Human("Child2", true, 12, father, mother);
        Human child3 = new Human("Child3", false, 15, father, mother);



        System.out.println(grandPa1);
        System.out.println(grandPa2);
        System.out.println(grandMa1);
        System.out.println(grandMa2);
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
        Human father, mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















