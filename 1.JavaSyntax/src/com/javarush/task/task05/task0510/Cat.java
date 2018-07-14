package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;


    public void initialize(String name) {
        this.name = name;
        this.color = "Black";
        this.weight = 4;
        this.age = 5;

    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Black";

    }

    public void initialize(String name, int age) {
        this.name = name;

        this.age = age;
        this.color = "Black";
        this.weight = 4;

    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 5;

    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;

        this.age = 5;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
