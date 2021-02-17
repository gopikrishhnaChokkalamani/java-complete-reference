package com.main.java.concurrency.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceRunnableClassMain {

  public static void main(String[] args) throws InterruptedException, ExecutionException {

    //executes only one thread
    //ExecutorService executorService = Executors.newSingleThreadExecutor();

    //Internally manages thread pool of 3 threads
    //ExecutorService executorService = Executors.newFixedThreadPool(3);

    //Internally manages thread pool of 10 threads to run scheduled tasks
    //ExecutorService executorService = Executors.newScheduledThreadPool(10);

    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
      }
    };

    ExecutorService executorService = Executors.newFixedThreadPool(10);

    executorService.execute(runnable);

    //provides aysnc impl
    Future<String> result = executorService.submit(runnable, "DONE");

    while(!result.isDone()) {
      System.out.println("Method Return value " + result.get());
      //Thread.sleep(1000);
    }
    executorService.shutdown();
  }
}
