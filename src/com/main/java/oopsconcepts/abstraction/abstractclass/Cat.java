package com.main.java.oopsconcepts.abstraction.abstractclass;

public class Cat extends Animal{

  @Override
  public void behaviour() {
    System.out.println("Cat Class behaviour");
  }

  public static void main(String[] args) {
    Animal animal = new Cat();
    animal.behaviour();
    animal.ecosystem();
  }
}
