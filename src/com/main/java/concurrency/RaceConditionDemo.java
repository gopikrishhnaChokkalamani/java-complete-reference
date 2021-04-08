package com.main.java.concurrency;

public class RaceConditionDemo {

  public static void main(String[] args) throws InterruptedException {
    Account account = new Account();
    account.setBalance(100);

    Thread john = new Thread(account);
    Thread mary = new Thread(account);

    john.setName("John");
    mary.setName("mary");

    john.start();
    //john.join(); //comment to see the race condition
    mary.start();
  }
}

class Account implements Runnable {

  private int balance;

  public void setBalance(int balance) {
    this.balance = balance;
  }

  @Override
  public void run() {
    //one way to fixing using synchronized this will avoid overdrawn, but our use case is john should withdraw first,
    // still the behaviour outcome is NOT correct
       // synchronized (this) {
          withdraw(75);
          //this.notify();
          if (balance < 0) {
            System.out.println("Money Overdrawn - " + Thread.currentThread().getName());
          }
       // }
//    withdraw(75);
//    if (balance < 0) {
//      System.out.println("Money Overdrawn - " + Thread.currentThread().getName());
//    }
  }

  private void withdraw(int amount) {
    if (amount < balance) {
      System.out.println(Thread.currentThread().getName() + " is about to withdraw");
      balance -= amount;
      System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount + ", and the current balance is " + balance);
    } else {
      System.out.println(Thread.currentThread().getName() + " - Not enough balance to withdraw, amount requested - " + amount + ", available balance is - " + balance);
    }
  }
}
