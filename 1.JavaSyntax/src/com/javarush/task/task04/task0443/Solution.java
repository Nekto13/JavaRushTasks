package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String s = reader.readLine();
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        int y = Integer.parseInt(s);
        int m = Integer.parseInt(s1);
        int d = Integer.parseInt(s2);

        System.out.printf( "Меня зовут %s.\nЯ родился %d.%d.%d\n", name, d, m, y );

    }
}
