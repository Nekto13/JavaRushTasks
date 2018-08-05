package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> bigList = new ArrayList<>();
        ArrayList<Integer> threeList = new ArrayList<>();
        ArrayList<Integer> twoList = new ArrayList<>();
        ArrayList<Integer> otherList = new ArrayList<>();

        for (int i = 0; i < 20 ; i++) {
            bigList.add(Integer.parseInt(reader.readLine()));

        }

        for (int i = 0; i < bigList.size() ; i++) {
            if(bigList.get(i)%3 == 0 && bigList.get(i)%2 == 0){
                threeList.add(bigList.get(i));
                twoList.add(bigList.get(i));
            }
            else if(bigList.get(i)%3 == 0)
                threeList.add(bigList.get(i));
            else if(bigList.get(i)%2 == 0)
                twoList.add(bigList.get(i));
            else
                otherList.add(bigList.get(i));
        }

        printList(threeList);
        printList(twoList);
        printList(otherList);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
