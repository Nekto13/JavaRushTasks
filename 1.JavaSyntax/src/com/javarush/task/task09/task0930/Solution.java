package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        /*String[] listString = null;
        int[] listNumber = null;
        int countString = 0;
        int countNumber = 0;*/
        ArrayList<String> listString = new ArrayList<>();
        ArrayList<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < array.length ; i++) {
            if(isNumber(array[i])){
               /* listNumber[countNumber] = Integer.valueOf(array[i]);
                countNumber++;*/
                listNumber.add(Integer.valueOf(array[i]));
            }
            else{
               /* listString[countString] = array[i];
                countString++;*/
                listString.add(array[i]);
            }

        }

        for (int i = 0; i </*listString.length - 1*/listString.size()-1 ; i++) {
            //for (int j = 0; j </*listString.length */ listString.size(); j++) {
                if(/*isGreaterThan(listString[i], listString[j])*/isGreaterThan(listString.get(i), listString.get(i+1))){
                   /* String temp = listString[i];
                    listString[i] = listString[j];
                    listString[j] = temp;*/
                   String temp = listString.get(i);
                listString.add(i, listString.get(i+1));
                listString.add(i+1, temp);
                }
            //}

        }

        for (int i = 0; i < /*listNumber.length - 1*/ listNumber.size()-1; i++) {
            if(/*listNumber[i] < listNumber[i+1]*/listNumber.get(i)<listNumber.get(i+1)){
                /*int temp = listNumber[i];
                listNumber[i] = listNumber[i+1];
                listNumber[i+1] = temp;*/
                int temp = listNumber.get(i);
                listNumber.add(i, listNumber.get(i+1));
                listNumber.add(i+1, temp);
            }
        }

        int countNumber1 = 0;
        int countString1 = 0;

        for (int i = 0; i < array.length; i++) {

            if(isNumber(array[i])){
                array[i] = String.valueOf(/*listNumber[countNumber1]*/listNumber.get(countNumber1));
                countNumber1++;

            }
            else{
                array[i] = /*listString[countString1]*/ listString.get(countString1);
                 countString1++;

            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
