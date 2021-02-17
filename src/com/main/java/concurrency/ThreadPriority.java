package com.main.java.concurrency;

public class ThreadPriority {

  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread().getName() + " : "+ i);
      }
    });

    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread().getName() + " : "+ i);
        Thread.yield();
      }
    });

    t1.setName("Thread 1");
    t1.setPriority(Thread.MAX_PRIORITY);

    t2.setName("Thread 2");
    t2.setPriority(Thread.MIN_PRIORITY);
    t2.join();

    t2.start();
    //see the execution of the code by commenting and uncommenting the join codes
    //t2.join();
    t1.start();

    //t2.join();

    //after observing the join results check the race condition demo
  }
}


