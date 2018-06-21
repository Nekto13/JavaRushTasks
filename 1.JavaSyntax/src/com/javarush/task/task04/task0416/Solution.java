package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double time = Double.parseDouble(s);

        double x = time%5;

        if(x >= 0 && x < 3)
            System.out.println("зелёный");
        else if(x >= 3 && x < 4)
            System.out.println("жёлтый");
        else
            System.out.println("красный");//напишите тут ваш код
    }
}