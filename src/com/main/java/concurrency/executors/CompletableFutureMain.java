package com.main.java.concurrency.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureMain {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    //executed aysnchrounsly, if no executor is specified, then it will uses the common fork join pool implementation
    //which will use a daemon thread to run the runnable
    CompletableFuture<Void> runAsync = CompletableFuture.runAsync(() -> {Thread.currentThread().isDaemon(); try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    });

    System.out.println("hi");
    boolean is = runAsync.isDone();
    System.out.println(is);
    boolean as = runAsync.isDone();
    System.out.println(is);
    System.out.println("hi");

    //thenApply() will happen after the completion stage, it will apply a function on the result from previous stage
    //execution of function will be blocking, now getNow() will only be reached after the function completes
    CompletableFuture<String> thenApply = CompletableFuture.completedFuture("thenApply").thenApply(String::toUpperCase);
    //get now() - retunrs the resulst if completed, otherwise returns default
    System.out.println(thenApply.getNow(null));

    //thenAccept() - if the completed does not return any result instead of Function thenApply() we can use thenAccept()
    // which is consumer
    StringBuilder sb = new StringBuilder();
    CompletableFuture.completedFuture("thenAccept").thenAccept(s -> sb.append(s));
    System.out.println(sb.toString());

    //asynchrnously accept
    StringBuilder sb1 = new StringBuilder();
    CompletableFuture<Void> thenApplyAsync = CompletableFuture.completedFuture("thenAcceptSync").thenAcceptAsync(s -> sb.append(s));
    thenApplyAsync.join();
    System.out.println(sb1.toString());

    //supply async example
    System.out.println("supplyAsync");
    supplyAsync();
    System.out.println("\nsupplyAsyncByExecutor");
    supplyAsyncByExecutor();
    System.out.println("\nsupplyAsyncWhenComplete");
    supplyAsyncWhenComplete();
  }

  //whenComplete - returns a new CompletionStage with same result or exception after completing the given action
  private static void supplyAsyncWhenComplete() throws ExecutionException, InterruptedException {
    CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> getData(20))
            .whenComplete((s, error) -> {
              send(s);
              if (error != null) {
                System.out.println(error);
              }
            });
            //.exceptionally(throwable -> )
            //.thenApplyAsync(s -> )
            //.thenAccept()

    //this will block
    cf.get();

    //this will not block returns a default value and main thread can continue
    //cf.getNow("completed");

    //or u can use a complete() method to manually complete
    cf.complete("completed");
  }

  //this will use the thread from executor, instead of forkjoinpool
  private static void supplyAsyncByExecutor() throws ExecutionException, InterruptedException {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> getData(20), executor).thenApply(s -> send(s));
    cf.get();
    executor.shutdown();
  }

  //when the code reaches supplyAsync - it will take a thread from forkjoinpool and executes asynchronously
  //if supplyasync takes long time, then it takes the same thread from supplyasynch and executes thenapply
  //so many thread is not blocked
  //thenapply uses the main thread to execute if nothin is blocked in supplyasync
  public static void supplyAsync() throws ExecutionException, InterruptedException {
    CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> getData(20)).thenApply(s -> send(s));
    cf.get();
  }

  //assume getting something from database
  public static String getData(int id) {
    System.out.println(Thread.currentThread().getName());
    //Thread.sleep(1000);
    return "data " + id;
  }

  //assume sending something to message broker
  public static String send(String data) {
    System.out.println(Thread.currentThread().getName());
    System.out.println(data);
    return data;
  }
}
