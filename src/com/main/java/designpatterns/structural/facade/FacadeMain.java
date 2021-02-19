package com.main.java.designpatterns.structural.facade;

public class FacadeMain {

  public static void main(String[] args) {
    MobileHandler mobileHandler = new MobileHandler();
    mobileHandler.getApple();
    mobileHandler.getGoogle();
    mobileHandler.getSamsung();
  }
}