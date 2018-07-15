package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int maximum = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(reader.readLine());
            list.add(a);
        }

        maximum = Collections.max(list);

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
