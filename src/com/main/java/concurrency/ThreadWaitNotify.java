package com.main.java.concurrency;

public class ThreadWaitNotify {

  public static void main(String[] args) throws InterruptedException {
    Message msg = new Message();
    msg.setName("Process this");

    Waiter w1 = new Waiter();
    w1.setMessage(msg);

    Thread t1 = new Thread(w1, "waiter1");
    t1.start();

    Waiter w2 = new Waiter();
    w2.setMessage(msg);

    Thread t2 = new Thread(w2, "waiter2");
    //t2.setPriority(10); -> no impact on notify() how underlying OS has implemented thread depends on which thread will be woken up
    t2.start();

    Notifier n = new Notifier();
    n.setMessage(msg);
    Thread t3 = new Thread(n, "Notifier");
    t3.start();
  }
}

class Message {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

class Waiter implements Runnable {

  private Message msg;

  public void setMessage(Message msg) {
    this.msg = msg;
  }

  @Override
  public void run() {
    String name = Thread.currentThread().getName();
    synchronized (msg) {
      System.out.println(name + " waiting to get notified");
      try {
        msg.wait(); //wait releases lock on the object
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(name + " got notified at " + System.currentTimeMillis());
      System.out.println(name + " processed");
    }
  }
}

class Notifier implements Runnable {

  private Message msg;

  public void setMessage(Message msg) {
    this.msg = msg;
  }

  @Override
  public void run() {
    String name = Thread.currentThread().getName();
    System.out.println(name + " started");
    synchronized (msg) {
      try {
        Thread.sleep(1000); //sleep does not release lock on the object
        msg.notify(); //wakes up only one thread
        //msg.notifyAll(); // wakes up all threads
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
