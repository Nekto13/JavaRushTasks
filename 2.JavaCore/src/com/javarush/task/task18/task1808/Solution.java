package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameFirst = reader.readLine();
        String fileNameSecond = reader.readLine();
        String fileNameThree = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileNameFirst);
        FileOutputStream fileOutputStreamSecond = new FileOutputStream(fileNameSecond);
        FileOutputStream fileOutputStreamThree = new FileOutputStream(fileNameThree);

        byte[] buff = new byte[fileInputStream.available()];

        while(fileInputStream.available() > 0){
            if(buff.length%2 == 0){
                byte[] o1 = new byte[fileInputStream.available()/2];
                byte[] o2 = new byte[fileInputStream.available()/2];
                int count1 = fileInputStream.read(o1);
                int count2 = fileInputStream.read(o2);
                fileOutputStreamSecond.write(o1, 0, count1);
                fileOutputStreamThree.write(o2, 0, count2);

            }
            else{
                byte[] o1 = new byte[fileInputStream.available()/2 +1];
                byte[] o2 = new byte[fileInputStream.available()/2];
                int count1 = fileInputStream.read(o1);
                int count2 = fileInputStream.read(o2);
                fileOutputStreamSecond.write(o1, 0, count1);
                fileOutputStreamThree.write(o2, 0, count2);
            }
        }

        reader.close();
        fileInputStream.close();
        fileOutputStreamSecond.close();
        fileOutputStreamThree.close();

    }
}
