package com.main.java.oopsconcepts.inheritance.diamondProblem;


public class Tiger implements CatFamily, CatEcosystem {

  // default method provides way to solve the diamond problem in interfaces
  @Override
  public void character() {
    CatFamily.super.character();
    CatEcosystem.super.character();
  }

  public static void main(String[] args) {
    Tiger t = new Tiger();
    t.character();
  }
}