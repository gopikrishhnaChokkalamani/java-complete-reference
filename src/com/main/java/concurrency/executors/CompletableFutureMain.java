package com.main.java.concurrency.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureMain {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> {Thread.currentThread().isDaemon(); try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    });

    System.out.println("hi");
    boolean is = cf.isDone();
    System.out.println(is);
    boolean as = cf.isDone();
    System.out.println(is);
    System.out.println("hi");

    CompletableFuture<String> cfs = CompletableFuture.completedFuture("message").thenApply(String::toUpperCase);
    System.out.println("After CFS");
    System.out.println(cfs.getNow(null));
    System.out.println("After getNow()");
  }
}
