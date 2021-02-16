package com.main.java.oopsconcepts.inheritance.diamondProblem;

public interface CatFamily extends AnimalInterface {

  @Override
  default void character() {
    System.out.println("CatFamily Interface character");
  }
}
