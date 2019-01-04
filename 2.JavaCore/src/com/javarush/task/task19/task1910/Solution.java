package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameFirst = reader.readLine();
        String fileNameSecond = reader.readLine();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileNameFirst));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileNameSecond));

        String line = "";

        while(bufferedReader.ready()){
            char data = (char) bufferedReader.read();
            line += String.valueOf(data);
        }

            String result = line.replaceAll("[^a-zA-Z\\d\\s[\\n]]", "");
            bufferedWriter.write(result );

        reader.close();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
