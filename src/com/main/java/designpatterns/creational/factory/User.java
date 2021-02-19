package com.main.java.designpatterns.creational.factory;

public abstract class User {

  private UserType type;

  User(UserType type) {
    this.type = type;
  }

  abstract String getProperty();

  public String getDetails() {
    return type.name() + " and " + getProperty();
  }
}
