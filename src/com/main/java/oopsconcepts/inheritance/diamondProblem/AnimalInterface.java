package com.main.java.oopsconcepts.inheritance.diamondProblem;

public interface AnimalInterface {

  default void character() {
    System.out.println("MemberInnerClass Interface character");
  }
}
