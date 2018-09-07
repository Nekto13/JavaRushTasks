package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameMonth = reader.readLine();
        HashMap<String, Integer> list = new HashMap<>();
        list.put("January", 1);
        list.put("February", 2);
        list.put("March", 3);
        list.put("April", 4);
        list.put("May", 5);
        list.put("June", 6);
        list.put("July", 7);
        list.put("August", 8);
        list.put("September", 9);
        list.put("October", 10);
        list.put("November", 11);
        list.put("December", 12);

        for(Map.Entry map : list.entrySet()){
            if(nameMonth.equals(map.getKey())){
                System.out.println(map.getKey() + " is the " + map.getValue() + " month");
            }
        }
    }
}
