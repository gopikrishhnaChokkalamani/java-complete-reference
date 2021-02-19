package com.main.java.designpatterns.creational.immutableclass;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Student {

  private int id;

  private String name;

  //Mutable Object
  private final Department department;

  //Mutable Object
  private final Map<String, String> map;

  public Student(int id, String name, Department department, Map<String, String> map) throws CloneNotSupportedException {
    this.id = id;
    this.name = name;
    this.department = (Department) department.clone();
    Map<String, String> newMap = new HashMap<>();
    for (Map.Entry<String, String> entry : map.entrySet()) {
      newMap.put(entry.getKey(), entry.getValue());
    }
    this.map = Collections.unmodifiableMap(newMap);
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Department getDepartment() {
    return department;
  }

  public Map<String, String> getMap() {
    return Collections.unmodifiableMap(map);
  }
}
