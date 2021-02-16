package com.main.java.oopsconcepts.abstraction.interfaces;

public class Cat extends Animal {

  @Override
  public void behaviour() {
    super.behaviour();
    System.out.println("Cat Class behaviour");
  }

  @Override
  public void ecosystem() {
    super.ecosystem();
    System.out.println("Cat Class ecosystem");
  }
}
