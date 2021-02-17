package com.main.java.singleton;

public class SingletonMain {

  public static void main(String[] args) {
    //Singleton - 1
    EagerStudent student = EagerStudent.getInstance();

    int i = 10;
    Integer ii = i;

    int j = ii;
  }
}
