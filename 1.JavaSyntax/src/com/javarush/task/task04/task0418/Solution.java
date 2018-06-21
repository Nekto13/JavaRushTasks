package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s2 = reader.readLine();
        int number = Integer.parseInt(s);//напишите тут ваш код
        int number2 = Integer.parseInt(s2);

        if(number > number2 || number == number2)
            System.out.println(number2);
        else
            System.out.println(number);
        //напишите тут ваш код
    }
}