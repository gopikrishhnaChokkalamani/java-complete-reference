package com.main.java.designpatterns.creational.singleton;

public class EagerStudent {

  private static final EagerStudent student = new EagerStudent();

  private EagerStudent() {
  }

  public static EagerStudent getInstance() {
    return student;
  }
}