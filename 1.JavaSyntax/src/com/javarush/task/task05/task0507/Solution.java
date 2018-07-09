package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int i = 0;

        while(true){
            String s = reader.readLine();
            int number = Integer.parseInt(s);

            if(number != -1){
                sum += number;
                i++;
            }
            else{
                break;
            }
        }

        System.out.println((double)sum/i);
    }
}

