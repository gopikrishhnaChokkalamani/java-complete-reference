package com.main.java.designpatterns.structural.decorator;

public class OrderInfo extends Order {

  @Override
  public void getDetails() {
    System.out.println("Order Info");
  }
}
