package com.javarush.task.task17.task1710;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
       SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);



            if(args[0].equals("-c")){

               Date bd = sim.parse(args[3]);
                Person person = null;

                if(args[2].equals("м")){
                    person = Person.createMale(args[1], bd );

                }else if(args[2].equals("ж")){
                    person = Person.createFemale(args[1], bd);

                }

                allPeople.add(person);
                System.out.println(allPeople.size() - 1);

            }
            else if(args[0].equals("-u")){

                Date bd = sim.parse(args[4]);
                int index = Integer.parseInt(args[1]);

                allPeople.get(index).setName(args[2]);
                if(args[3].equals("м")){
                    allPeople.get(index).setSex(Sex.MALE);
                }
                else if(args[3].equals("ж")){
                    allPeople.get(index).setSex(Sex.FEMALE);
                }
                allPeople.get(index).setBirthDate(bd);


            }
            else if(args[0].equals("-d")){
                int index = Integer.valueOf(args[1]);
                allPeople.get(index).setName(null);
                allPeople.get(index).setSex(null);
                allPeople.get(index).setBirthDate(null);

            }
            else if(args[0].equals("-i")){
                int index = Integer.valueOf(args[1]);
                Date date = allPeople.get(index).getBirthDate();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                Sex sex = allPeople.get(index).getSex();
                String pol = null;
                if(sex.equals(Sex.MALE)){
                    pol = "м";
                }
                else if(sex.equals((Sex.FEMALE))){
                    pol = "ж";
                }


                System.out.println(allPeople.get(index).getName() + " " + pol + " " + simpleDateFormat.format(date));
            }


    }
}
