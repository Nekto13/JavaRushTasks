package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameFirst = reader.readLine();
        String fileNameSecond = reader.readLine();

        FileReader fileReader = new FileReader(fileNameFirst);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(fileNameSecond);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line = "";

        while(bufferedReader.ready()){
            char data = (char) fileReader.read();
            line += String.valueOf(data);
        }

        Pattern pattern = Pattern.compile("\\b[0-9]+\\b");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()){
            int result = Integer.parseInt(matcher.group());
            bufferedWriter.write(result + " ");
        }

        reader.close();
        bufferedReader.close();
        bufferedWriter.close();

    }
}
