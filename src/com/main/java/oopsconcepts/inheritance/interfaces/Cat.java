package com.main.java.oopsconcepts.inheritance.interfaces;

import com.main.java.oopsconcepts.inheritance.interfaces.Animal;

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

  @Override
  public void ecosystem() {
    super.ecosystem();
    System.out.println("Cat class ecosystem");
  }
}
