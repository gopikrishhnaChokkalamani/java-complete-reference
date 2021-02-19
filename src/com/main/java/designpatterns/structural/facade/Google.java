package com.main.java.designpatterns.structural.facade;

public class Google implements Mobile {

  @Override
  public void model() {
    System.out.println("Google Pixel 5");
  }

  @Override
  public void price() {
    System.out.println("Google Pixel 5 price is $700");
  }
}
