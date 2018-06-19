package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int number = Integer.parseInt(s);

        if(number < 0){
            number++;
            System.out.println(number);
        }
        else if(number > 0){
            number *= 2;
            System.out.println(number);
        }
        else if(number == 0){
            System.out.println(number);
        }//напишите тут ваш код

    }

}