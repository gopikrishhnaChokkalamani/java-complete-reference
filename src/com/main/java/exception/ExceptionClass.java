package com.main.java.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionClass {

  void oneThrow() {
    throw new UnsupportedOperationException();
  }

  void multipleThrows() throws UnsupportedOperationException, ArithmeticException{

  }

  void tryCatch() {

    //before java 7
    try {
      Scanner scanner = new Scanner(new File("test.text"));
      while(scanner.hasNext()) {
        System.out.println(scanner.nextLine());
      }
    } catch (Exception e) {

    } finally {

    }

    //after Java 7 - try with resources
    // no need to close explicitly, java takes care
    try (Scanner scanner = new Scanner(new File("test.text"))) {
      while(scanner.hasNext()) {
        System.out.println(scanner.nextLine());
      }
    } catch (ArithmeticException | NullPointerException | FileNotFoundException npe) { //multiple exceptions in catch block
      // if hierrachy of exception is to be used u can use only one
      // you cannot do this will result in compile error (ArithmeticException | NullPointerException | FileNotFoundException | Exception e)
    } finally {

    }
  }
}
