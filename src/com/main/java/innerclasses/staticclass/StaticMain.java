package com.main.java.innerclasses.staticclass;

import java.util.HashMap;
import java.util.Map;

public class StaticMain {

  //class can be static only if its nested
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

    StaticClass nested = new StaticClass();
    nested.nonStaticMethod();
    StaticClass.staticMethod();

  }

}
