package com.main.java.innerclasses.local;

public class LocalInnerClass {

  void message() {
    class LocalClass {
      void message() {
        System.out.println("Local Class Message");
      }
    }

    LocalClass l = new LocalClass();
    l.message();
  }

  public static void main(String[] args) {
    LocalInnerClass l = new LocalInnerClass();
    l.message();
  }
}
