package com.main.java.designpatterns.structural.decorator;

public class CurrentOffer extends OrderDetail {

  public CurrentOffer(Order order) {
    super(order);
  }

  @Override
  public void getDetails() {
    super.getDetails();
    System.out.println("Current Offer");
  }
}
