package com.main.java.designpatterns.creational.factory;

public class Student extends User{

  Student(UserType type) {
    super(type);
  }

  @Override
  String getProperty() {
    return "He can study";
  }
}
