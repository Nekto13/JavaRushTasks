package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listMin = new ArrayList<>();



        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        int min = list.get(0).length();

        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).length() <= min){
                min = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() == min)
                listMin.add(list.get(i));
        }

        for (int i = 0; i < listMin.size() ; i++) {
            System.out.println(listMin.get(i));

        }
    }
}
