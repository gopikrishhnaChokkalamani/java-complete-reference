package com.main.java.abstraction.abstrac;

public class AbstractClassMain {

  public static void main(String[] args) {

    //you cannot create object for abstract class
    //AbstractClass a = new AbstractClass();

    AnotherClass a = new AnotherClass();
    a.onMessage();
    a.process();
  }
}
