package com.main.java.designpatterns.structural.facade;

public class Samsung implements Mobile{

  @Override
  public void model() {
    System.out.println("Samsung Note 10");
  }

  @Override
  public void price() {
    System.out.println("Samsung Note 10 price i $1200");
  }
}
