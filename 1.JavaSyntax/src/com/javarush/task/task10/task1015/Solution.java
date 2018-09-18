package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[5];
        list[0] = new ArrayList<String>();
        list[1] = new ArrayList<String>();
        list[2] = new ArrayList<String>();
        list[3] = new ArrayList<String>();
        list[4] = new ArrayList<String>();

        for (int i = 0; i < 3 ; i++) {
            list[0].add("list"+i);
            list[1].add(1+"list"+i);
            list[2].add(2+"list"+i);
            list[3].add(3+"list"+i);
            list[4].add(4+"list"+i);
        }

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}