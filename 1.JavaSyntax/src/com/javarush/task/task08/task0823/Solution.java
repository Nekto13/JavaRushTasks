package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = s.trim();

        String[] stringArray = s1.split("\\s+");
        String newString = "";

        for (int i = 0; i < stringArray.length ; i++) {
            String str = stringArray[i].substring(0, 1).toUpperCase() + stringArray[i].substring(1);
            newString += str + " ";
        }

        System.out.println(newString.trim());

        //напишите тут ваш код
    }
}
