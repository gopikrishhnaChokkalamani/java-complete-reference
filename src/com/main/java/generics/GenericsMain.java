package com.main.java.generics;

import java.util.Arrays;
import java.util.List;

public class GenericsMain {

  public static void main(String[] args) {
    //Generics on Interface
    Cat cat = new Cat();
    System.out.println(cat.character("Meows"));

    //WildCards
    fetch(Arrays.asList(1, 2, 3, 4, 5));
    fetch(Arrays.asList("hello", "hi"));

    // Bounded Type Parameter
    Student student = new Student();
    student.print(Arrays.asList("student list 1", "student list 2"));
  }

  //WildCards
  public static void fetch(List<?> req) {
    req.stream().forEach(System.out::println);
  }

  //Even Constructors can be applied with Generics

  //Bounded WildCards
  public static void go(List<? extends Animal> cats) {

  }
}
