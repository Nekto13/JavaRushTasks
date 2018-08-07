package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;
        int maxI = 0;
        int minI = 0;


        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() > maxLength){
                maxLength = list.get(i).length();
                maxI = i;
            }
        }

        for (int i = 0; i < list.size(); i++) {

            if(list.get(i).length() < minLength){
                minLength = list.get(i).length();
                minI = i;

            }

        }

       if(maxI < minI)
           System.out.println(list.get(maxI));
        else
           System.out.println(list.get(minI));
    }
}
