package com.main.java.designpatterns.creational.singleton;

public class LazyStudent {

  private static LazyStudent student;

  private LazyStudent() {}

  public static LazyStudent getInstance() {
    if (student == null) {
      return new LazyStudent();
    }
    return student;
  }
}
