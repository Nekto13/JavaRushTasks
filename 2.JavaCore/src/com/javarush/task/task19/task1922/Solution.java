package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        FileReader fileReader = new FileReader(nameFile);
        Scanner scanner = new Scanner(fileReader);

        String readLine = "";
        ArrayList<String> arraLine = new ArrayList<>();
        while(scanner.hasNextLine()){
            readLine = scanner.nextLine();
            arraLine.add(readLine);
        }

        for (int i = 0; i < arraLine.size() ; i++) {
            /*if(arraLine.contains("\bфайл\b") && arraLine.contains("\bвид\b") && !arraLine.contains("\bВ\b")){
                System.out.println(arraLine.get(i));
            }
            else if(arraLine.contains("\bвид\b") && arraLine.contains("\bВ\b") && !arraLine.contains("\bфайл\b")){
                System.out.println(arraLine.get(i));
            }
            else if(arraLine.contains("\bфайл\b") && arraLine.contains("\bВ\b") && !arraLine.contains("\bвид\b")){
                System.out.println(arraLine.get(i));
            }*/


            if(words.get(0).contains(arraLine.get(i)) && words.get(1).contains(arraLine.get(i)) && !words.get(2).contains(arraLine.get(i))){
                System.out.println(arraLine.get(i));
            }
            else if(words.get(2).contains(arraLine.get(i)) && words.get(1).contains(arraLine.get(i)) && !words.get(0).contains(arraLine.get(i))){
                System.out.println(arraLine.get(i));
            }
            else if(words.get(0).contains(arraLine.get(i)) && words.get(2).contains(arraLine.get(i)) && !words.get(1).contains(arraLine.get(i))){
                System.out.println(arraLine.get(i));
            }


        }

        reader.close();
        scanner.close();
        fileReader.close();

    }
}
