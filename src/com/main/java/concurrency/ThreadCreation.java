package com.main.java.concurrency;

public class ThreadCreation {

  //Different Ways to Create Thread
  public static void main(String[] args) {
    Thread t = new Thread(new Task());
    t.start();

    //since extending thread class, it becomes a thread object
    //you cannot extend any other class on AnotherTask, because of thread
    AnotherTask at = new AnotherTask();
    at.start();

    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Runnable Interface as Anonymous class");
      }
    });
    t1.start();

    Thread t3 = new Thread(() -> System.out.println("Runnable Interface from Lambda"));
    t3.start();

    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("Runnable Interface as local inner class");
      }
    };

    Thread t4 = new Thread(runnable);
    t4.start();
  }
}

class Task implements Runnable {

  @Override
  public void run() {
    System.out.println("Running from Runnable Interface");
  }
}

class AnotherTask extends Thread {
  @Override
  public void run() {
    System.out.println("Running from Thread Class");
  }
}