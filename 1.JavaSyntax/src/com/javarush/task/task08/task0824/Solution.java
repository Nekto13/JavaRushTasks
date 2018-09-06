package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son = new Human("tomi", true, 15);
        Human son2 = new Human("keny", true, 6);
        Human douther = new Human("ola", false, 10);
        Human mather = new Human("Ksu", false, 40);
        mather.children.add(son);
        mather.children.add(son2);
        mather.children.add(douther);
        Human father = new Human("Kola", true, 40);
        father.children.add(son);
        father.children.add(son2);
        father.children.add(douther);
        Human grandFather1 = new Human("Vasia", true, 80);
        grandFather1.children.add(father);
        Human grandMuther1 = new Human("baba", false, 80);
        grandMuther1.children.add(father);

        Human grandFather2 = new Human("deda", true, 80);
        grandFather2.children.add(mather);
        Human grandMuther2 = new Human("baba2", false, 80);
        grandMuther2.children.add(mather);

        System.out.println(grandMuther1);
        System.out.println(grandFather1);
        System.out.println(grandMuther2);
        System.out.println(grandFather2);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(son);
        System.out.println(son2);
        System.out.println(douther);
    }

    public static class Human {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        ArrayList<Human> children = new ArrayList<>();

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
