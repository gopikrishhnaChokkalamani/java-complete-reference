package com.main.java.oopsconcepts.inheritance.inheritance;

public interface Clickable {

  default void process() {
    System.out.println("click");
  }
}
