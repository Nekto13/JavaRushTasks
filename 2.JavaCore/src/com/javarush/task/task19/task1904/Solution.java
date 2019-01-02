package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner scaner) {
            this.fileScanner = scaner;
        }

        @Override
        public Person read() throws IOException {
            Person person = null;
            if(fileScanner.hasNext()) {
                String data = fileScanner.nextLine();
                String[] dataPerson = data.split(" ");
                int year = Integer.valueOf(dataPerson[5]);
                int month = Integer.valueOf(dataPerson[4]) - 1;
                int day = Integer.valueOf(dataPerson[3]);
                Calendar date = new GregorianCalendar(year, month, day);

                person = new Person(dataPerson[1], dataPerson[2], dataPerson[0], date.getTime());
            }



            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}
