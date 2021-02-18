package com.main.java.singleton;

public class SingletonMain {

  //Singleton pattern restricts the instantiation of a class and ensures that only
  // one instance of the class exists in the java virtual machine
  //Singleton pattern is used for logging, drivers objects, caching and thread pool.
  public static void main(String[] args) {
    //Singleton - 1
    EagerStudent student = EagerStudent.getInstance();

    int i = 10;
    Integer ii = i;

    int j = ii;
  }
}
