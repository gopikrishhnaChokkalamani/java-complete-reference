package com.main.java.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMain {

  // can used only in list implemented classes
  // can do create, update and delete
  //bi directional iteration
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("hello", "hi", "welcome");
    ListIterator<String> iterator = strings.listIterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    System.out.println();
    while (iterator.hasPrevious()) {
      System.out.println(iterator.previous());
    }
  }
}