package com.main.java.oopsconcepts.inheritance.interfaces;

public interface AnimalInterface {

  public void character();

  public void isCarnivorous();

  public void isDomestic();

  static void staticMethod() {
    System.out.println("Animal INterface static method");
  }

  default void defaultMethod() {
    System.out.println("Animal INterface static method");
  }
}
