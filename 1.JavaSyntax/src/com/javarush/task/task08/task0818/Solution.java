package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> list = new HashMap<>();
        for (int i = 0; i < 10 ; i++) {
            list.put("Имя" + i, 495 + i);
        }
        return list;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)iterator.next();
            if((int) entry.getValue() < 500){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {



    }
}