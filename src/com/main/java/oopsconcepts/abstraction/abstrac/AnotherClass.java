package com.main.java.oopsconcepts.abstraction.abstrac;

public class AnotherClass extends AbstractClass {

  @Override
  public void onMessage() {
    System.out.println("On Message Recieived - "  + AbstractClass.class.getSimpleName());
  }
}
