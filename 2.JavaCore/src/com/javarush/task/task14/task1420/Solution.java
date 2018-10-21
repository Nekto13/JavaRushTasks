package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOne = Integer.parseInt(reader.readLine());
        int numberTwo = Integer.parseInt(reader.readLine());

        if (numberOne <= 0 ||numberTwo <= 0) {
            throw new IllegalArgumentException();
        }


        System.out.println(Nod(numberOne, numberTwo));
    }

    private static int Nod(int a, int b) {

        if(b == 0){
            return a;
        }
        return Nod(b, a%b);
    }
}
