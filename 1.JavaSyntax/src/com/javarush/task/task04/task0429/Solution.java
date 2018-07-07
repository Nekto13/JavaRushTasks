package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s2 = reader.readLine();//напишите тут ваш код
        String s3 = reader.readLine();

        int number = Integer.parseInt(s);
        int number2 = Integer.parseInt(s2);
        int number3 = Integer.parseInt(s3);

        int a = 0;
        int b = 0;

        if(number > 0)
            a++;
        else if(number < 0)
            b++;

        if(number2 > 0)
            a++;
        else if(number2 < 0)
            b++;

        if(number3 > 0)
            a++;
        else if(number3 < 0)
            b++;

        System.out.printf("количество отрицательных чисел: %d\nколичество положительных чисел: %d", b,a);

        //напишите тут ваш код

    }
}
