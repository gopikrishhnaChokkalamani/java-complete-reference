package com.main.java.abstraction.abstrac;

public abstract class AbstractClass {

  public abstract void onMessage();

  public void process() {
    System.out.println("Process Method - " + AbstractClass.class.getSimpleName());
  }
}
