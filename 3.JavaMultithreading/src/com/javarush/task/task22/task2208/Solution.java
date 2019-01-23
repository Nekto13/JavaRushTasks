package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();
        params.put("name", "Ivanov");
        params.put("country", "Ukraine");
        params.put("city", "Kiev");
        params.put("age", null);

        String str = Solution.getQuery(params);

        System.out.println(str);

    }
    public static String getQuery(Map<String, String> params) {
        String str = "";

        if(params == null || params.isEmpty()){
            return "";
        }


        for(Map.Entry<String, String> map : params.entrySet()){

            if(map.getValue() != null){
                str += map.getKey() + " = " + "'" + map.getValue() + "'"  + " and ";
            }

        }

        String result = str.substring(0, str.lastIndexOf(" and "));


        return result;
    }
}
