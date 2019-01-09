package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        Scanner scan = new Scanner(fileReader);

        ArrayList<String> arrayLine = new ArrayList<>();
        while (scan.hasNextLine()){
            arrayLine.add(scan.nextLine());
        }
        fileReader.close();

        Map<String, Double> listEmployee = new TreeMap<>();

        for (int i = 0; i <arrayLine.size() ; i++) {
            String[] array = arrayLine.get(i).split(" ");
            String name = array[0];
            Double volume = Double.parseDouble(array[1]);

            if(listEmployee.containsKey(name)){
                Double vol = listEmployee.get(name);
                Double db = vol + volume;
                listEmployee.remove(name);
                listEmployee.put(name, db);
            }
            else{
                listEmployee.put(name, volume);
            }
        }



        for(Map.Entry<String, Double> e : listEmployee.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());

        }






    }
}
