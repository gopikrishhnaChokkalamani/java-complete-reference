package com.main.java.designpatterns.creational.factory;

public class Factory {

  public static User getUser(UserType user) {
    if (user == UserType.STAFF) {
      return new Staff(user);
    } else if (user == UserType.STUDENT) {
      return new Student(user);
    } else {
      return new Teacher(user);
    }
  }
}
