package com.main.java.statickeyword;

import java.util.HashMap;
import java.util.Map;

public class StaticMain {

  //static variable
  private static Map<String, String> map = new HashMap<>();

  //static block
  static {
    map.put("id", "12");
  }

  //class can be static only if its nested
  //this Builder pattern
  //also singleton static iner class impl
  public static class StaticClass {

    public static void staticMethod() {
      System.out.println("Static Nested class :: static Method");
    }

    public void nonStaticMethod() {
      System.out.println("Static Nested Class :: non static Method");
    }
  }

  public static void staticMethod() {
    System.out.println("Static Main class :: static Method");
  }

  public void nonStaticMethod() {
    System.out.println("Static Main Class :: non static Method");
  }

  public static void main(String[] args) {
    StaticMain main = new StaticMain();
    main.nonStaticMethod();
    StaticMain.staticMethod();

    StaticMain.StaticClass nested = new StaticClass();
    nested.nonStaticMethod();
    StaticMain.StaticClass.staticMethod();

    map.put("name", "john");

    for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }
  }

}
