package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(7, 14);
    }

    public static void closeToTen(int a, int b) {
        int c = 10 - a;
        int d = 10 - b;
        if(Solution.abs(c) < Solution.abs(d)){
            System.out.println(a);
        }
        else if(Solution.abs(d) < Solution.abs(c)){
            System.out.println(b);
        }//напишите тут ваш код
        else{
            System.out.println(a);
        }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}