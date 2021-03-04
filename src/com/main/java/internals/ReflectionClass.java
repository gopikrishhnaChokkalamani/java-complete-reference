package com.main.java.internals;

import java.util.HashSet;
import java.util.Set;

public class ReflectionClass {

  public static void main(String[] args) throws ClassNotFoundException {
    Class clazz = Class.forName("com.main.java.internals.ReflectionClass");
    System.out.println(clazz.isInterface());
    System.out.println(clazz.getName());
    System.out.println(clazz.getSuperclass());
    System.out.println(clazz.getMethods());
    System.out.println(clazz.getClassLoader());
    System.out.println(clazz.getFields());
    System.out.println(clazz.getSimpleName());

    ReflectionClass c = new ReflectionClass();
    Class clazz1 = c.getClass();

    Set set= new HashSet();
    Class clazz2 = set.getClass();

    int i = 0;
  }
}
