package com.main.java.collections;

import java.util.*;

public class AllListMain {

  public static void main(String[] args) {
    //insertion order, not synchronization, can have duplicates
    //data manipulation slow
    // if the initial size is achieved, inreases by 50%
    //can use iterator
    List<String> list = new ArrayList<>();
    list.add("john");
    list.add("mary");
    list.add("john");
    list.add("mary");
    list.add("sam");
    list.add("jack");
    list.add(null);
    list.stream().forEach(System.out::println);

    //why array list maniupulation is slow
    //when you remove an element in the array, all the elements will shift one cell to left i.e i = i - 1;
    //this is O(n)
    //so for records of 1000, u will see performance issue coming up

    System.out.println();

    //insertion order, synchronization so poor performance, can have duplicates
    // if the initial size is achieved, inreases by 100%
    //can use Iterator, Enumerator
    Vector<String> vector = new Vector<>();
    vector.add("john");
    vector.add("mary");
    vector.add("john");
    vector.add(null);
    vector.stream().forEach(System.out::println);

    Enumeration<String> e = vector.elements(); //using enumeration to iterate

    System.out.println();

    //insertion order, not synchrnozied, can have duplicates
    //data manipulation is fast due to doubly linked list implementation
    List<String> ll = new LinkedList<>();
    ll.add("john");
    ll.add("mary");
    ll.add("john");
    ll.stream().forEach(System.out::println);
    //LinkedList l2 = new LinkedList();
    // if you do it, then u add First, add last, get First, get Last
    // you will not have these features if you do List l = new LinkedList();
  }
}
