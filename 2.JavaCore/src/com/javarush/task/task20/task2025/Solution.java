package com.javarush.task.task20.task2025;

import java.util.Date;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        long[] result = new long[100];
        int S, M;
        int a = 0;
        //boolean isFlag = false;

        for (long i = 0; i < N ; i++) {

            S = 0;
            int sumNumber;

            String number = String.valueOf(i);
            char[] arrayNumber = number.toCharArray();

            int n;
            int S22 = 0;

            for (int j = 0; j < arrayNumber.length ; j++) {

                sumNumber = 1;
                int count = 0;
                String s1 = String.valueOf(arrayNumber[j]);
                n = Integer.parseInt(s1);
                M = arrayNumber.length;

                while(count < M){
                    sumNumber *= n;
                    count++;
                }
                S = sumNumber;
                S22 += S;

            }

            if(S22 == i){
                result[a++] = i;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        Date start = new Date();
        long[] res = Solution.getNumbers(1000);
        for (int i = 0; i < res.length ; i++) {
            System.out.println(res[i]);
        }

        long usedBytes = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println("----" + usedBytes/1048576 + "------");

        Date end = new Date();
        System.out.println(end.getTime() - start.getTime());

    }
}
