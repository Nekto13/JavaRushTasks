package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayNumber = new int[15];
        int numberOfPeople_even = 0;
        int numberOfPeople_odd = 0;

        for (int i = 0; i < arrayNumber.length ; i++) {
            int number = Integer.parseInt(reader.readLine());
            arrayNumber[i] = number;
        }

        for (int i = 0; i < arrayNumber.length ; i++) {
            if(i%2 == 0 || i == 0)
                numberOfPeople_even += arrayNumber[i];
            else
                numberOfPeople_odd += arrayNumber[i];

        }

        if(numberOfPeople_even > numberOfPeople_odd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");


    }
}
