package com.main.java.designpatterns.behavioural.chainofresponsibility;

public interface Chain {

  void next(Chain chain);

  void process(long amount, Approval approval);
}
