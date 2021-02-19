package com.main.java.designpatterns.structural.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.LineNumberInputStream;

public class DecoratorMain {

  public static void main(String[] args) throws FileNotFoundException {
    //a classic example for this is java io package
    //Here the primary object is decorated to the end state with two different objects
    //LineNumberInputStream lineNumberInputStream = new LineNumberInputStream(new BufferedInputStream(new FileInputStream("test.txt")));

    Order order = new CurrentOffer(new FutureOffer(new MissedOffer(new OrderInfo())));
    order.getDetails();
    System.out.println();
  }
}
