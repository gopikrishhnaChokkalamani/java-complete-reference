package com.main.java.oopsconcepts.polymorphism;

//run time polymorphism
//assocation happens at run time
public class DynamicPolymorphism {

  public static void main(String[] args) {
    Animal animal = new Cat();
    animal.character();
    animal.isCarnivorous();
    animal.isDomestic();
  }
}
