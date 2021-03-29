package com.main.java.inheritance;

public interface Clickable {

  default void process() {
    System.out.println("click");
  }
}
