package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.ArrayList;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String s = reader.readLine();
        ArrayList<Integer> number = new ArrayList<>();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length ; i++) {
           Integer a = Integer.valueOf(array[i]);
           number.add(a);
        }

        for (int i = 0; i < number.size(); i++) {
            if(number.get(i)%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.printf("Even: %d Odd: %d", even, odd);
    }
}
