package com.main.java.inheritance;

public class Button implements Clickable, Accessible{
  @Override
  public void process() {
    Accessible.super.process();
    Clickable.super.process();
  }

  public static void main(String[] args) {
    Button b = new Button();
    b.process();
  }
}
