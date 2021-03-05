package com.main.java.designpatterns.behavioural.chainofresponsibility;

public class AreaMgr implements Chain {

  private Chain chain;

  @Override
  public void next(Chain chain) {
    this.chain = chain;
  }

  @Override
  public void process(long amount, Approval approval) {
    if (amount < 10000) {
      System.out.println("Amount is : " + amount);
      System.out.println("Approved by Panel Review");
      approval.setReviewedByPanel(true);
    } else {
      System.out.println("Amount is : " + amount);
      System.out.println("Reviewed by Review Panel - Need approval from Division Manager");
      this.chain.process(amount, approval);
    }
  }
}
