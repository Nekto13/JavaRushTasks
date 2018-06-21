package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        String s4 = reader.readLine();
        int number = Integer.parseInt(s);//напишите тут ваш код
        int number2 = Integer.parseInt(s2);
        int number3 = Integer.parseInt(s3);
        int number4 = Integer.parseInt(s4);

        int m1 = Math.max(number, number2);
        int m2 = Math.max(number3, number4);
        int m3 = Math.max(m1, m2);
        System.out.println(m3);


    }
}
