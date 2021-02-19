package com.main.java.designpatterns.structural.decorator;

public class MissedOffer extends OrderDetail {

  public MissedOffer(Order order) {
    super(order);
  }

  @Override
  public void getDetails() {
    super.getDetails();
    System.out.println("Missed Offer");
  }
}
