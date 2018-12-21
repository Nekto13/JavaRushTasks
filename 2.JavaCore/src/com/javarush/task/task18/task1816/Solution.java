package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) {


        int count = 0;
        char[] alphavit = getCharArray();
        char[] upAlphavit = getUpCharArray();

        try {
            //String name = "c:/Dump/file.txt";
            FileInputStream fileReader = new FileInputStream(args[0]);

            while(fileReader.available() > 0){
                char a = (char) fileReader.read();

                for (int i = 0; i < alphavit.length ; i++) {
                    if(alphavit[i] == a || upAlphavit[i] == a ){
                        count++;
                    }
                }

            }

            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(count);

    }

    public static  char[] getCharArray(){
        char[] charArray = new char[26];
        for (int i=0; i< 26; i++) {
            charArray[i] = (char)('a' + i);
        }

        return charArray;
    }

    public static  char[] getUpCharArray(){
        char[] charArray = new char[26];
        for (int i=0; i< 26; i++) {
            charArray[i] = (char)('A' + i);
        }

        return charArray;
    }
}
