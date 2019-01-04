package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFileFirst = reader.readLine();
        String nameFileSecond = reader.readLine();

        FileReader fileReader = new FileReader(nameFileFirst);
        FileWriter fileWriter = new FileWriter(nameFileSecond);

        ArrayList<Integer> array = new ArrayList<>();
        while(fileReader.ready()){
            int data = fileReader.read();
            array.add(data);
        }

        for (int i = 0; i < array.size() ; i++) {
            if(i%2 != 0){
                fileWriter.write(array.get(i));
            }
        }

        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
