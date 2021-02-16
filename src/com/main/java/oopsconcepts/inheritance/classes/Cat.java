package com.main.java.oopsconcepts.inheritance.classes;

//class cannot extend multiple classes - multiple inheritance not possible in class
// error -> public class Cat extends MemberInnerClass, EcoSystem {
//but with java 8 interface - static, default methods - its possible to achieve
public class Cat extends Animal{

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
