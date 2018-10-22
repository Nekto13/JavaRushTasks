package com.javarush.task.task14.task1419;

import java.awt.*;
import java.lang.reflect.MalformedParametersException;
import java.security.KeyException;
import java.security.acl.LastOwnerException;
import java.sql.BatchUpdateException;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.BackingStoreException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        }
        catch (MalformedParametersException k){
            exceptions.add(k);
        }
        catch (HeadlessException h){
            exceptions.add(h);
        }
        catch (ClassCastException b){
            exceptions.add(b);
        }
        catch (ArrayIndexOutOfBoundsException ar){
            exceptions.add(ar);
        }
        catch (NumberFormatException n){
            exceptions.add(n);
        }
        catch (IllegalArgumentException il){
            exceptions.add(il);
        }
        catch (IndexOutOfBoundsException i){
            exceptions.add(i);
        }
        catch (NullPointerException nu){
            exceptions.add(nu);
        }

        catch (ArithmeticException a){
            exceptions.add(a);
        }
        catch (Exception e) {
            exceptions.add(e);
        }


        //напишите тут ваш код

    }
}
