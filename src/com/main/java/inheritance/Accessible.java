package com.main.java.inheritance;

public interface Accessible {

  default void process() {
    System.out.println("access");
  }
}
