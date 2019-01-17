package com.javarush.task.task21.task2102;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* 
Сравниваем модификаторы
*/
public class Solution {
    public static void main(String[] args) {
        int classModifiers = Solution.class.getModifiers();
        System.out.println(isModifierSet(classModifiers, Modifier.PUBLIC));   //true
        System.out.println(isModifierSet(classModifiers, Modifier.STATIC));   //false

        int methodModifiers = getMainMethod().getModifiers();
        System.out.println(isModifierSet(methodModifiers, Modifier.STATIC));      //true
    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {
        boolean isFlag = false;

        if(Modifier.isAbstract(allModifiers) && Modifier.isAbstract(specificModifier)) isFlag = true;
        if(Modifier.isFinal(allModifiers) && Modifier.isFinal(specificModifier)) isFlag = true;
        if(Modifier.isInterface(allModifiers) && Modifier.isInterface(specificModifier)) isFlag = true;
        if(Modifier.isNative(allModifiers) && Modifier.isNative(specificModifier)) isFlag = true;
        if(Modifier.isPrivate(allModifiers) && Modifier.isPrivate(specificModifier)) isFlag = true;
        if(Modifier.isProtected(allModifiers) && Modifier.isProtected(specificModifier)) isFlag = true;
        if(Modifier.isPublic(allModifiers) && Modifier.isPublic(specificModifier)) isFlag = true;
        if(Modifier.isStatic(allModifiers) && Modifier.isStatic(specificModifier)) isFlag = true;
        if(Modifier.isStrict(allModifiers) && Modifier.isStrict(specificModifier)) isFlag = true;
        if(Modifier.isSynchronized(allModifiers) && Modifier.isSynchronized(specificModifier)) isFlag = true;
        if(Modifier.isTransient(allModifiers) && Modifier.isTransient(specificModifier)) isFlag = true;
        if(Modifier.isVolatile(allModifiers) && Modifier.isVolatile(specificModifier)) isFlag = true;

        return isFlag;
    }

    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
