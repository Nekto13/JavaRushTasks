package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        int a = Integer.parseInt(s);//напишите тут ваш код
        int b = Integer.parseInt(s1);//напишите тут ваш код
        int c = Integer.parseInt(s2);

        if((a >= (b + c)) || (b >= (a + c)) || (c >= (a + b)))
            System.out.println("Треугольник не существует.");
        else
            System.out.println("Треугольник существует.");//напишите тут ваш код
    }
}