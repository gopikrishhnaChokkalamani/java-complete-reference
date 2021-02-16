package com.main.java.collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

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
    //synchronized
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

  }
}
