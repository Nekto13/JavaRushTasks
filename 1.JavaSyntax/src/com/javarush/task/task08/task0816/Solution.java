package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<>();

        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Stallone1", df.parse("JUNE 1 1980"));
        map.put("Stallone2", df.parse("JUNE 1 1980"));
        map.put("Stallone3", df.parse("JUNE 1 1980"));
        map.put("Stallone4", df.parse("JUNE 1 1980"));
        map.put("Stallone5", df.parse("JUNE 1 1980"));
        map.put("Stallone6", df.parse("JUNE 1 1980"));
        map.put("Stallone7", df.parse("JUNE 1 1980"));
        map.put("Stallone8", df.parse("JUNE 1 1980"));
        map.put("Stallone9", df.parse("JUNE 1 1980"));


        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            Date date = (Date)entry.getValue();
            if(date.getMonth() > 4 && date.getMonth() < 8){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}
