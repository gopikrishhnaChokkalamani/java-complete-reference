package com.main.java.designpatterns.creational.singleton;

public class EagerStudent {

  //idea is to have only one object at a time
  private static final EagerStudent student = new EagerStudent();

  private EagerStudent() {
  }

  public static EagerStudent getInstance() {
    return student;
  }
}