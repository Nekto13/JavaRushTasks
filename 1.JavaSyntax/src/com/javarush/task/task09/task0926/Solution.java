package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> listArray = new ArrayList<>();
        int[] five = {1, 2, 3, 4, 5};
        int[] two = {1, 2};
        int[] four = {1, 2, 3, 4};
        int[] seven = {1, 2, 3, 4, 5, 6, 7};
        int[] zero = {};

        listArray.add(five);
        listArray.add(two);
        listArray.add(four);
        listArray.add(seven);
        listArray.add(zero);

        return listArray;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
