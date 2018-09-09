package com.javarush.task.task09.task0917;

/* 
Перехват unchecked-исключений
*/

public class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());
    }

    public static void processExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }catch (NullPointerException e){
            printStack(e);
        }catch(IndexOutOfBoundsException i){
            printStack(i);
        }catch(NumberFormatException n){
            printStack(n);
        }

    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}

