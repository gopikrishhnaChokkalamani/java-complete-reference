package com.main.java.collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class AllMapMain {

  public static void main(String[] args) {
    //cannot have duplicates - value will be overwritten
    //can have one null key, multiple null values
    //no order
    Map<String, String> map = new HashMap<>();
    map.put("name", "john");
    map.put("id", "123456");
    map.put("department", "computer science");
    map.put("name", "mary");
    map.put(null, null);
    map.put(null, null);
    map.put("subject", null);

    for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }

    System.out.println();

    //one null key, multiple null values
    //keys are accessed in inserstion order
    LinkedHashMap<String, String> lMap = new LinkedHashMap<>();
    lMap.put("name", "john");
    lMap.put("id", "123456");
    lMap.put("department", "computer science");
    lMap.put("name", "mary");
    lMap.put(null, null);
    lMap.put(null, null);
    lMap.put("subject", null);

    for (Map.Entry<String, String> entry : lMap.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }

    System.out.println();
    //cannot have null key, can have null values
    //keys accessed in ascending order
    Map<String, String> tMap = new TreeMap<>();
    tMap.put("name", "john");
    tMap.put("id", "123456");
    tMap.put("department", "computer science");
    tMap.put("name", "mary");
    //tMap.put(null, null);
    //tMap.put(null, null);
    tMap.put("subject", null);

    for (Map.Entry<String, String> entry : tMap.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }

    System.out.println();

    //cannot have null key or null value
    //synchronized - locks the entire object
    Hashtable<String, String> hash = new Hashtable<>();
    hash.put("name", "john");
    hash.put("id", "123456");
    hash.put("department", "computer science");
    hash.put("name", "mary");
    //hash.put("subject", null);

    //use enumeration to print values
    //can be used with vector and hashtable
    Enumeration<String> s = hash.elements();
    while (s.hasMoreElements()) {
      System.out.println(s.nextElement());
    }

    System.out.println();

    for (Map.Entry<String, String> entry : hash.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }

    System.out.println();

    //Does not allow null key or value
    //thread safe - but lock is on the block of the map
    //for read map is not locked
    Map<String, String> cMap = new ConcurrentHashMap<>();
    cMap.put("name", "john");
    cMap.put("id", "123456");
    cMap.put("department", "computer science");
    cMap.put("name", "mary");

    for (Map.Entry<String, String> entry : cMap.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }

    //Convert a HashMap to ConcurrentHashMap
    Map<String, String> newCMap = new ConcurrentHashMap<>(map);

    System.out.println();

    //lock on the entire object
    //even read will lock the object
    // if one thread is modifying and another is iterating over, then will result in concurrent modification exception
    Map<String, String> sMap = Collections.synchronizedMap(map);

  }
}
