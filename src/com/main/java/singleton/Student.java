package com.main.java.singleton;

public class Student {

  private static final Student student = new Student();

  private Student() {
  }

  public static Student getInstance() {
    return student;
  }
}