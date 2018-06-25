package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();//напишите тут ваш код
        String s2 = reader.readLine();//напишите тут ваш код
        String s3 = reader.readLine();

        int number = Integer.parseInt(s);//напишите тут ваш код
        int number2 = Integer.parseInt(s2);//напишите тут ваш код
        int number3 = Integer.parseInt(s3);

        if((number > number2 && number < number3) || (number > number3 && number < number2)){
            System.out.println(number);
        }
        else if((number2 > number && number2 < number3) || (number2 > number3 && number2 < number)){
            System.out.println(number2);
        }
        else if((number3 > number && number3 < number2) || (number3 > number2 && number3 < number)){
            System.out.println(number3);
        }
        else if(number == number2 && number == number3){
            System.out.println(number);
        }
        else if(number == number2 || number == number3 && number2 != number3){
            System.out.println(number);
        }
        else  if(number2 == number3 && number2 != number){
            System.out.println(number2);
        }//напишите тут ваш код
    }
}
