package com.main.java.designpatterns.creational.factory;

public class Teacher extends User {
  public Teacher(UserType type) {
    super(type);
  }

  @Override
  String getProperty() {
    return "He can teach";
  }
}
