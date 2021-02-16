package com.main.java.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class IteratorMain {

  //one direction only - forward, cannot access previous element
  public static void main(String[] args) {

    //On List
    List<String> strings = Arrays.asList("hello", "hi", "welcome");
    Iterator<String> iterator = strings.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    //On Set
    Set<String> sets = Arrays.asList("hello", "hi", "welcome").stream().collect(Collectors.toSet());
    sets.add("hello");
    sets.add("hi");
    sets.add("welcome");

    Iterator<String> setIterator = sets.iterator();
    while (setIterator.hasNext()) {
      System.out.println(setIterator.next());
      setIterator.remove(); // can also remove, but not update
    }

    //On Map
    Map<String, String> map = new HashMap<>();
    map.put("name", "john");
    map.put("id", "12344");
    map.put("age", "12");

    Iterator<Map.Entry<String, String>> mapIterator = map.entrySet().iterator();
    while (mapIterator.hasNext()) {
      Map.Entry<String, String> entry = mapIterator.next();
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }

    //also possible
    //map.keySet().iterator(); - on keys
    //map.values().iterator(); - on values
  }
}
