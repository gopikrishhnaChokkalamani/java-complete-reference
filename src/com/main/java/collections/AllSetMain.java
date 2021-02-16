package com.main.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AllSetMain {

  public static void main(String[] args) {
    //Cannot have duplicates, no order
    Set<String> sets = new HashSet<>();
    sets.add("john");
    sets.add("mark");
    sets.add("mary");
    sets.add("sam");
    sets.add("jack");
    sets.add(null);
    //even if you add duplicate, it will not result in failure, it will just be eliminated
    sets.add("john");
    sets.stream().forEach(System.out::println);
    System.out.println();
    //Cannot have duplicates, insertion order, brings doubly linked list qualities, but does not have add first,
    // add last, get first, get last like linked list
    LinkedHashSet<String> lh = new LinkedHashSet<>();
    lh.add("john");
    lh.add("mark");
    lh.add("john");
    lh.stream().forEach(System.out::println);
    System.out.println();

    //cannot have duplicates, sorted by ascending by default
    Set<Integer> t = new TreeSet<>();
    t.add(13);
    t.add(2);
    t.add(9);
    t.add(6);
    t.add(2);
    t.stream().forEach(System.out::println);

    //sorted ascenting order, ignored duplicates
    Set<String> tset = new TreeSet<>();
    tset.add("mark");
    tset.add("john");
    tset.add("mark");
    tset.stream().forEach(System.out::println);
    System.out.println();

  }
}
