package com.main.java.designpatterns.structural.decorator;

public class OrderDetail extends Order {

  protected Order order;

  public OrderDetail(Order order) {
    this.order = order;
  }

  @Override
  public void getDetails() {
    this.order.getDetails();
  }
}
