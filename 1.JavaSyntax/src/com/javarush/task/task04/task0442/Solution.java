package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        while(true){

            String s = reader.readLine();
            int number = Integer.parseInt(s);
            if(number !=-1){
                sum = sum + number;
            }
            else{
                break;
            }
        }
        System.out.println(sum - 1);
    }
}
