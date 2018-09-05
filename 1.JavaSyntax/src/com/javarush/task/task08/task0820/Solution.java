package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> list = new HashSet<>();
        for (int i = 0; i <3 ; i++) {
            list.add(new Dog());
        }
        return list;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> set = new HashSet<>();

        set.addAll(cats);
        set.addAll(dogs);

        return set;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код

        for (int i = 0; i < cats.toArray().length ; i++) {
            pets.remove(cats.toArray()[i]);
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for(Object ob : pets){
            System.out.println(ob);
        }
    }

    //напишите тут ваш код
    public static class Cat{

    }

    public static class Dog{

    }
}
