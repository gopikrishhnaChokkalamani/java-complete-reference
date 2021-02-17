package com.main.java.concurrency.executors;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceCallableClassMain {

  public static void main(String[] args) throws InterruptedException, ExecutionException {

    //Remember u cannot create thread using callable.. so u needed an executor
    //callable call throw exception, runnable does not throw exception
//    Callable<String> callable = new Callable<String>() {
//      @Override
//      public String call() throws Exception {
//        return null;
//      }
//    };

    Callable<String> callable = () -> {
      TimeUnit.MILLISECONDS.sleep(3000);
      return Thread.currentThread().getName() + " :: Current time :: " + LocalDateTime.now();
    };

    ExecutorService executor = Executors.newFixedThreadPool(1);

    //Executor Service using invokeAll()
    //when fixed thread pool is 1, then the below will call same thread and return 3 results
    //if u inrease nThreads to 10, below will run different threads
    List<Callable<String>> tasks = Arrays.asList(callable, callable, callable);

    //when callable is completed, it will store the result, it might not have the result now, but will hold it in future
    //helps in keeping track of a thread and its result
    //future does not have errir handling and complete method, so its kind of waiting, u will loose the advantage of complete async here
    //result.get() will block the main thread
    List<Future<String>> results = executor.invokeAll(tasks);
    for (Future<String> result : results) {
      System.out.println(result.get());
    }

    System.out.println();

    //Executor Service using submit()
    for (Callable<String> task : tasks) {
      Future<String> result = executor.submit(task);
      if (!result.isDone()) {
        System.out.println("Method Return value : " + result.get());
      }
    }
    executor.shutdown();
  }
}
