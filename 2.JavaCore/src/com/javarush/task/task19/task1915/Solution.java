package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/


import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        PrintStream console = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        FileOutputStream fileInputStream = new FileOutputStream(reader.readLine());
        String result = outputStream.toString();

        fileInputStream.write(result.getBytes());

        System.setOut(console);
        System.out.println(result);

        reader.close();
        fileInputStream.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

