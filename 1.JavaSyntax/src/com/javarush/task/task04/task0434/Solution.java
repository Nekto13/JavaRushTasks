package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       int a = 1;
       int b = 1;
       int x = 1;
       int y = 1;

       while(y <= 10){

           while(x <= 10) {
               System.out.print((a) * (b++));
               System.out.print(" ");
               x++;
           }
           x = 1;
           b = 1;
           a++;
           System.out.println();
           y++;
       }//напишите тут ваш код

    }
}
