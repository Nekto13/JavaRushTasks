package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public  InnerClass[] innerClasses = new InnerClass[2];

    public static class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] list = new Solution[2];

        Solution sol = new Solution();
        sol.innerClasses[0] = new InnerClass();
        sol.innerClasses[1] = new InnerClass();
        Solution sol2 = new Solution();
        sol2.innerClasses[0] = new InnerClass();
        sol2.innerClasses[1] = new InnerClass();

        list[0] = sol;
        list[1] = sol2;


        return list;
    }

    public static void main(String[] args) {

    }
}
