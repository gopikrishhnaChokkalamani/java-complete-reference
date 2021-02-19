package com.main.java.designpatterns.structural.facade;

public class MobileHandler {

  private Mobile apple;

  private Mobile samsung;

  private Mobile google;

  public MobileHandler() {
    this.apple = new Apple();
    this.samsung = new Samsung();
    this.google = new Google();
  }

  public void getApple() {
    apple.model();
    apple.price();
  }

  public void getSamsung() {
    samsung.model();
    samsung.price();
  }

  public void getGoogle() {
    google.model();
    google.price();
  }
}
