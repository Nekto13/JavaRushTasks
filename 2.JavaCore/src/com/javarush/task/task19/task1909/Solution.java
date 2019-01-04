package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

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

        String result = line.replace(".", "!");
        bufferedWriter.write(result, 0, result.length());

        reader.close();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
