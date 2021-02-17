package com.main.java.concurrency;

public class SynchronizationMain {

  //All these are mutually exclusive locks

  //implement synchronization to make sure only one thread accesses the logic at a given time
  //so that data is not corrupted

  //static synchronization
  //lock on class not on object
  //meaning only 1 thread can access class
  public static synchronized void process() {

  }

  //synchronized block - lock on the block of code inside the method
  public void execute() {
    String s1 = "hello";
    synchronized (s1) {

    }
  }

  //synchronization on method, lock on the method
  public synchronized void run() {

  }
}
