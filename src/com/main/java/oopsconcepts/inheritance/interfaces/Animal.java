package com.main.java.oopsconcepts.inheritance.interfaces;

public class Animal implements AnimalInterface, EcoSystemInterface {

  @Override
  public void character() {
    System.out.println("MemberInnerClass Class character");
  }

  @Override
  public void isCarnivorous() {
    System.out.println("MemberInnerClass Class isCarnivours");
  }

  @Override
  public void isDomestic() {
    System.out.println("MemberInnerClass class isDomestic");
  }

  @Override
  public void ecosystem() {
    System.out.println("MemberInnerClass class ecosystem");
  }
}
