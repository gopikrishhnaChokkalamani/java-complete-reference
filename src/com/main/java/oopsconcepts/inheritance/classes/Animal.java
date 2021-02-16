package com.main.java.oopsconcepts.inheritance.classes;

//but multi level is possible in class ex : cat -> animal -> ecosystem
public class Animal extends EcoSystem {

  public void character() {
    System.out.println("MemberInnerClass Class character");
  }

  public void isCarnivorous() {
    System.out.println("MemberInnerClass Class isCarnivours");
  }

  public void isDomestic() {
    System.out.println("MemberInnerClass class isDomestic");
  }
}
