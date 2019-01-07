package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(outputStream);
        System.setOut(myStream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(console);

        String s = result.replace("\n", "");
        String[] array = s.split(" ");
        int numberOne = Integer.parseInt(array[0]);
        int numberTwo = Integer.parseInt(array[2]);

        int resultAriphmetic = 0;
        if(result.contains("+")){
            resultAriphmetic = numberOne + numberTwo;
        }
        else if(result.contains("*")){
            resultAriphmetic = numberOne * numberTwo;
        }
        else if(result.contains("-")){
            resultAriphmetic = numberOne - numberTwo;
        }

        System.out.printf(s + resultAriphmetic);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

