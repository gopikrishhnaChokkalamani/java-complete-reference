package com.main.java.oopsconcepts.abstraction.abstrac;

public abstract class AbstractClass {

  public abstract void onMessage();

  public void process() {
    System.out.println("Process Method - " + AbstractClass.class.getSimpleName());
  }
}
