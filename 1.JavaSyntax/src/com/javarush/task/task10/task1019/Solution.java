package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        HashMap<String, Integer> list = new HashMap<>();

        while(true){
            String s = reader.readLine();
            if(s.isEmpty()) break;

            int id = Integer.parseInt(s);
            String name = reader.readLine();

            list.put(name, id);
        }

        for(Map.Entry map : list.entrySet()){
            System.out.println(map.getValue() + " " + map.getKey());
        }

        //System.out.println("Id=" + id + " Name=" + name);
    }
}
