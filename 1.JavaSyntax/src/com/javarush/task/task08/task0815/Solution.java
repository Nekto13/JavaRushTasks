package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> list = new HashMap<>();
        list.put("Иванов", "Дима");
        list.put("Петров", "Коля");
        list.put("Сидоров", "Саша");
        list.put("Араратов", "Гоша");
        list.put("Кузьмин", "Дима");
        list.put("Сухой", "Антон");
        list.put("Полный", "Гриша");
        list.put("Тугой", "Витя");
        list.put("Сплошной", "Коля");
        list.put("Большой", "Толя");

        return list;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        Iterator iterator = map.entrySet().iterator();
        int count = 0;
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = (Map.Entry) iterator.next();
            if(entry.getValue().equals(name)){
                count++;
            }
        }

        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        Iterator iterator = map.entrySet().iterator();
        int count = 0;
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = (Map.Entry) iterator.next();
            if(entry.getKey().equals(lastName)){
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {

    }
}
