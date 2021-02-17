package com.main.java.collections;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class AllQueueMain {

  public static void main(String[] args) {

    //can have duplicates, insertion order, can have null inked list acting as queue here
    Queue<String> queue = new LinkedList<>();
    queue.add("john");
    queue.add("mary");
    queue.add("john");
    queue.add("mary");
    queue.add("sam");
    queue.add("jack");
    queue.add(null);

    while(!queue.isEmpty()) {
      System.out.println(queue.remove());
    }

    System.out.println();

    //cannot have null values, insertion order, duplicates ok
    Queue<String> arr = new ArrayDeque<>();
    arr.add("john");
    arr.add("mary");
    arr.add("john");
    arr.add("mary");
    arr.add("sam");
    arr.add("jack");
    //arr.add(null); cannot have null value, will fail

    while(!arr.isEmpty()) {
      System.out.println(arr.remove());
    }

    System.out.println();

    //cannot have null values, can have duplicates, sorted to ascending default
    //Queue<String> pq = new PriorityQueue<>();
    //sort in ascending by length
    //Queue<String> pq = new PriorityQueue<>(Comparator.comparing(s -> s.length()));
    //sort descending
    Queue<String> pq = new PriorityQueue<>((s1, s2) -> s2.charAt(0) - s1.charAt(0));
    pq.add("john");
    pq.add("mary");
    pq.add("john");
    pq.add("mary");
    pq.add("sam");
    pq.add("jack");
    //pq.add(null);

    while(!pq.isEmpty()) {
      System.out.println(pq.remove());
    }

    //queue.remove - if queue is emmpty throws exception
    //queue.poll - returns null
  }
}