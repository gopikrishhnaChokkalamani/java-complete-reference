package com.main.java.oopsconcepts.inheritance.inheritance;

public interface Accessible {

  default void process() {
    System.out.println("access");
  }
}
