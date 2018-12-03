package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileIn = new FileInputStream(fileName);
        ArrayList<Integer> array = new ArrayList<>();

        while(fileIn.available()>0){
            int data = fileIn.read();
            array.add(data);
        }
        reader.close();
        fileIn.close();


        int min = Collections.min(array);


        System.out.println(min);
    }
}
