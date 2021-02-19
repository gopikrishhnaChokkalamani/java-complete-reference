package com.main.java.designpatterns.behavioural.chainofresponsibility;

public class DivisionMgr implements Chain {

  private Chain chain;

  @Override
  public void next(Chain chain) {
    this.chain = chain;
  }

  @Override
  public void process(long amount, Approval approval) {
    System.out.println("Amount is : " + amount);
    System.out.println("Approved by Division Manager");
    approval.setHasDivisionManagerApproved(true);
  }
}
