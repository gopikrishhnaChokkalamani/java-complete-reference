package com.main.java.oopsconcepts.inheritance.interfaces;

public interface EcoSystemInterface {

  public void ecosystem();

  static void staticMethod() {
    System.out.println("EcoSystem INterface static method");
  }

  default void defaultMethod() {
    System.out.println("EcoSystem INterface static method");
  }
}
