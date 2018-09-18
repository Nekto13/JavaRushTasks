package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private String address;
        private Date birthDay;
        private String proffession;
        private char sex;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Human(String name, int age, String address, Date birthDay) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.birthDay = birthDay;
        }

        public Human(String name, int age, String address, Date birthDay, String proffession) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.birthDay = birthDay;
            this.proffession = proffession;
        }

        public Human(String name, int age, String address, Date birthDay, String proffession, char sex) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.birthDay = birthDay;
            this.proffession = proffession;
            this.sex = sex;
        }

        public Human(String name, char sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, Date birthDay) {
            this.name = name;
            this.birthDay = birthDay;
        }

        public Human(String name, Date birthDay, char sex) {

            this.name = name;
            this.birthDay = birthDay;
            this.sex = sex;
        }

        public Human(String name, String proffession) {
            this.name = name;
            this.proffession = proffession;
        }


    }
}
