package com.main.java.designpatterns.creational.factory;

public class Staff extends User {

  public Staff(UserType type) {
    super(type);
  }

  @Override
  String getProperty() {
    return "Takes care of non teaching work";
  }
}
