package com.main.java.designpatterns.structural.facade;

public class Apple implements Mobile {

  @Override
  public void model() {
    System.out.println("Apple 12");
  }

  @Override
  public void price() {
    System.out.println("Apple 12 price is $1000");
  }
}
