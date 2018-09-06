package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;

import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> listPeopleCity = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            listPeopleCity.put(city, family);

        }

        String city1 = reader.readLine();

        for(Map.Entry entry : listPeopleCity.entrySet()){
            if(city1.equals(entry.getKey())){
                System.out.println(entry.getValue());
            }
        }
    }
}
