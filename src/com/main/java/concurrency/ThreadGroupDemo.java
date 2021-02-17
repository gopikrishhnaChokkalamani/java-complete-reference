package com.main.java.concurrency;

public class ThreadGroupDemo {

  public static void main(String[] args) {
    Runnable runnable = () -> System.out.println(Thread.currentThread().getName());

    new Thread(runnable, "ten").start();

    ThreadGroup grp = new ThreadGroup("thread-group-1");
    new Thread(grp, runnable, "one").start();
    new Thread(grp, runnable, "two").start();
    new Thread(grp, runnable, "three").start();
    grp.list();

    new Thread(runnable, "eight").start();
  }
}
