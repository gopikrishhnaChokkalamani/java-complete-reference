package com.main.java.innerclasses.nestedinterface;

public interface NestedInterface {

  void message();

  public interface NestedNestedInterface {

    void message();

    class AnotherClass {

      public void message() {
        System.out.println("hello");
      }
    }
  }
}
