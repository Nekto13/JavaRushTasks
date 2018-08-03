package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayNumberBig = new int[20];
        int[] arrayNumberSmall_1 = new int[10];
        int[] arrayNumberSmall_2 = new int[10];

        for (int i = 0; i < arrayNumberBig.length ; i++) {
            int number = Integer.parseInt(reader.readLine());
            arrayNumberBig[i] = number;
        }

        System.arraycopy(arrayNumberBig, 0, arrayNumberSmall_1, 0, arrayNumberSmall_1.length);
        System.arraycopy(arrayNumberBig, 10, arrayNumberSmall_2, 0, arrayNumberSmall_2.length);

        for (int i = 0; i < arrayNumberSmall_2.length; i++) {
            System.out.println(arrayNumberSmall_2[i]);

        }



    }
}
