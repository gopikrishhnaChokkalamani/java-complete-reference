package com.main.java.oopsconcepts.abstraction.interfaces;

public interface InterfaceAll {
  
  static final String MESSAGE = "Hello";
  
  String ANOTHER_MESSAGE = null;
  
  void message();
  
  default void defaultMessage() {
    
  }
  
  static void staticMessage() {
    
  }
}
