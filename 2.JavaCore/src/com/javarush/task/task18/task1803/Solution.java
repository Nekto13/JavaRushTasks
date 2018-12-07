package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fileIn = new FileInputStream(fileName);

        ArrayList<Integer> list = new ArrayList<>();

        while(fileIn.available()>0){
            int data = fileIn.read();
            list.add(data);

        }
        reader.close();
        fileIn.close();

        Solution.foundMaxBytes(list);


    }

    public static void foundMaxBytes(ArrayList<Integer> list){

       Set<Integer> valueList = new TreeSet<>();
       // ArrayList<Integer> valueList = new ArrayList<>();
        int count = 0;
        int maxRepit = 0;



        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if(list.get(i) == list.get(j)){
                    count++;


                }


            }

            if(count > maxRepit){
                maxRepit = count;
                count = 0;
               valueList.clear();
              valueList.add(list.get(i));

            }
            else if(count == maxRepit){
                count = 0;
                valueList.add(list.get(i));
            }


        }

        Iterator<Integer> iterator = valueList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        /*for (int i = 0; i < valueList.size() ; i++) {
            System.out.print(valueList.get(i) + " ");
        }*/



    }
}
