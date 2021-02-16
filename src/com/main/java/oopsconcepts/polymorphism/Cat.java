package com.main.java.oopsconcepts.polymorphism;

public class Cat extends Animal {

  @Override
  public void character() {
    super.character();
    System.out.println("Cat class character");
  }

  @Override
  public void isCarnivorous() {
    super.isCarnivorous();
    System.out.println("Cat class isCarnivorous");
  }

  @Override
  public void isDomestic() {
    super.isDomestic();
    System.out.println("Cat class isDomestic");
  }
}
