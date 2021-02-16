package com.main.java.innerclasses.anonymous;

abstract class Person {
  abstract void speak();
}
public class AnonymousClass {

  public static void main(String[] args) {
    Person p = new Person() {
      @Override
      void speak() {
        System.out.println("Inside Anonymous Class speak");
      }
    };
    p.speak();
  }
}
