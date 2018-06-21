package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();//напишите тут ваш код
        String s2 = reader.readLine();

        if(s.equals(s2))
            System.out.println("Имена идентичны");
        else if(!s.equals(s2) && s.length() == s2.length())
            System.out.println("Длины имен равны");//напишите тут ваш код
    }
}
