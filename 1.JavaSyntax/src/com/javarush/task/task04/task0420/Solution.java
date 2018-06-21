package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();//напишите тут ваш код
        String s2 = reader.readLine();//напишите тут ваш код
        String s3 = reader.readLine();
        int number = Integer.parseInt(s);
        int number2 = Integer.parseInt(s2);
        int number3 = Integer.parseInt(s3);

        int x = 0;
        int x2 = 0;
        int x3 = 0;

        if(number >= number2 && number >= number3)
            x = number;
        else if(number2 >= number && number2 >= number3)
            x = number2;
        else if(number3 >= number && number3 >= number2)
            x = number3;

        if(number >= number2 && number <= number3)
            x2 = number;
        else if(number >= number3 && number <= number2)
            x2 = number;
        else if(number2 >= number && number2 <= number3)
            x2 = number2;
        else if(number2 >= number3 && number2 <= number)
            x2 = number2;
        else if(number3 >= number && number3 <= number2)
            x2 = number3;
        else if(number3 >= number2 && number3 <= number)
            x2 = number3;

        if(number <= number2 && number <= number3)
            x3 = number;
        else if(number2 <= number && number2 <= number3)
            x3 = number2;
        else if(number3 <= number && number3 <= number2)
            x3 = number3;

        System.out.println(x + " " + x2 + " " + x3);
    }
}
