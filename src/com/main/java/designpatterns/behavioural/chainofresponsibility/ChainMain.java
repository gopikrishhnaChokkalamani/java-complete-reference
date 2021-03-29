package com.main.java.designpatterns.behavioural.chainofresponsibility;

public class ChainMain {

  private Chain chain;

  public ChainMain() {
    this.chain = new Supervisor();
    Chain areaMgr = new AreaMgr();
    Chain division = new DivisionMgr();
    chain.next(areaMgr);
    areaMgr.next(division);
  }

  //classic example is loan approval process, where if the amout is larger it needs approval from above
  //another exmaple is avoiding multiple if else loops
  //classic example Filter - filter chain
  public static void main(String[] args) {
    ChainMain cm = new ChainMain();
    cm.chain.process(10000, new Approval()); //change the amount to 900 and 9000 and see the behaviour
  }
}
