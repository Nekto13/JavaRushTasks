package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] arrayString = new String[10];
        int[] arrayNumber = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arrayString.length ; i++) {
            String s = reader.readLine();
            arrayString[i] = s;

        }

        for (int i = 0; i < arrayNumber.length ; i++) {
            arrayNumber[i] = arrayString[i].length();

        }

        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.println(arrayNumber[i]);

        }
    }
}
