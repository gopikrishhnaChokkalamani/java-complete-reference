package com.main.java.generics;

public class Cat implements Animal<String, String> {

  @Override
  public String character(String req) {
    return "Cat " + req;
  }
}
