package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/


import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date data = new Date();
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd M yyyy");//напишите тут ваш код
        System.out.println(dataFormat.format(data));
    }
}
