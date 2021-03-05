package com.main.java.oopsconcepts.inheritance.interfaces;

public class Animal implements AnimalInterface, EcoSystemInterface {

  @Override
  public void character() {
    System.out.println("Animal Class character");
  }

  @Override
  public void isCarnivorous() {
    System.out.println("Animal Class isCarnivours");
  }

  @Override
  public void isDomestic() {
    System.out.println("Animal class isDomestic");
  }

  @Override
  public void defaultMethod() {
    System.out.println("Animal Class defaultMethod");
  }

  @Override
  public void ecosystem() {
    System.out.println("Animal class ecosystem");
  }
}
