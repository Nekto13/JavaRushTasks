package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(nameFile);


        String line = "";
        while(fileInputStream.available() > 0){
            int data = fileInputStream.read();
            line+=(char)data;
        }

        System.out.printf(line,"\r\n");

        reader.close();
        fileInputStream.close();
    }
}