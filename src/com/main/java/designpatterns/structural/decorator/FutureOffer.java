package com.main.java.designpatterns.structural.decorator;

public class FutureOffer  extends OrderDetail {

  public FutureOffer(Order order) {
    super(order);
  }

  @Override
  public void getDetails() {
    super.getDetails();
    System.out.println("Future Offer");
  }
}
