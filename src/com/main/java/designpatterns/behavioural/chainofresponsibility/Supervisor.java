package com.main.java.designpatterns.behavioural.chainofresponsibility;

public class Supervisor implements Chain {

  private Chain chain;

  @Override
  public void next(Chain chain) {
    this.chain = chain;
  }

  @Override
  public void process(long amount, Approval approval) {
    if (amount < 1000) {
      System.out.println("Amount is : " + amount);
      System.out.println("Approved by Supervisor");
      approval.setHasSupervisorApproved(true);
    } else {
      System.out.println("Amount is : " + amount);
      System.out.println("Reviewed by Supervisor - Need approval from Review Panel");
      this.chain.process(amount, approval);
    }
  }
}
