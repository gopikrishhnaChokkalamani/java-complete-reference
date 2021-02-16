package com.main.java.oopsconcepts.inheritance.diamondProblem;

public interface CatEcosystem extends AnimalInterface {

  @Override
  default void character() {
    System.out.println("CatEcosystem Interface character");
  }
}
