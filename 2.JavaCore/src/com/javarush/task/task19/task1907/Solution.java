package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();

        FileReader fileReader = new FileReader(nameFile);
        String line = "";

        while(fileReader.ready()){
            char data = (char)fileReader.read();
            line += String.valueOf(data).toLowerCase();
        }

        int count = 0;

        Pattern pattern = Pattern.compile("\\bworld\\b");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()){
            count++;
        }

        System.out.println(count);

        reader.close();
        fileReader.close();



    }

}
