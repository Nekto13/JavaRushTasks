package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Максимальный байт
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


        int max = Collections.max(array);


        System.out.println(max);

    }
}
