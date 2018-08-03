package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        ArrayList<String> listMax = new ArrayList<>();
        int max = 0;


        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < strings.size() ; i++) {
            if(strings.get(i).length() >= max){
                max = strings.get(i).length();
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() == max)
                listMax.add(strings.get(i));
        }

        for (int i = 0; i < listMax.size() ; i++) {
            System.out.println(listMax.get(i));

        }
    }
}
