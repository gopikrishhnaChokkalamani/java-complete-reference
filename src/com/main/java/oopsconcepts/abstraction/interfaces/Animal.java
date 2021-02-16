package com.main.java.oopsconcepts.abstraction.interfaces;

public class Animal implements AnimalInterface {

  @Override
  public void behaviour() {
    System.out.println("MemberInnerClass Class behaviour");
  }

  @Override
  public void ecosystem() {
    System.out.println("MemberInnerClass Class ecoSystem");
  }
}
