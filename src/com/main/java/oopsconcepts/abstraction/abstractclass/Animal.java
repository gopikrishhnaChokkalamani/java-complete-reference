package com.main.java.oopsconcepts.abstraction.abstractclass;

//not complete abstraction as still can have contrete methods
//cannot create object of this class
public abstract class Animal {

  public abstract void behaviour();

  public void ecosystem() {
    System.out.println("Abstract class - ecosystem");
  }
}