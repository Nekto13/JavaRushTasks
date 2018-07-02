package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        int numberOne = Integer.parseInt(s);//напишите тут ваш код
        int numberTwo = Integer.parseInt(s1);//напишите тут ваш код
        int numberThree = Integer.parseInt(s2);

        if(numberOne > 0 && numberTwo > 0 && numberThree > 0){
            System.out.println(3);
        }
        else if((numberOne > 0 && numberTwo > 0 && numberThree <= 0)||(numberOne > 0 && numberTwo <= 0 && numberThree > 0) || (numberOne <= 0 && numberTwo > 0 && numberThree > 0)){
            System.out.println(2);
        }
        else if((numberOne > 0 && numberTwo <= 0 && numberThree <= 0)||(numberOne <= 0 && numberTwo <= 0 && numberThree > 0) || (numberOne <= 0 && numberTwo > 0 && numberThree <= 0)){
            System.out.println(1);
        }
        else if(numberOne <= 0 && numberTwo <= 0 && numberThree <= 0){
            System.out.println(0);
        }//напишите тут ваш код

    }
}
