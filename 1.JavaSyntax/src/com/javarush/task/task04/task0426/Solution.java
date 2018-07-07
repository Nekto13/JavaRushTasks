package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int number = Integer.parseInt(s);

        if(number > 0 && number%2 == 0)
            System.out.println("положительное четное число");
        else if(number > 0 && number%2 != 0)
            System.out.println("положительное нечетное число");
        else if(number < 0 && number%2 == 0)
            System.out.println("отрицательное четное число");
        else if(number < 0 && number%2 != 0)
            System.out.println("отрицательное нечетное число");
        else if(number == 0)
            System.out.println("ноль");
    }
}
