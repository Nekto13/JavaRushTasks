package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static{
        Solution.labels.put(3.1, "e");
        Solution.labels.put(3.2, "e1");
        Solution.labels.put(3.3, "e2");
        Solution.labels.put(3.4, "e3");
        Solution.labels.put(3.5, "e4");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
