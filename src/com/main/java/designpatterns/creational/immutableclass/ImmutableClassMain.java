package com.main.java.designpatterns.creational.immutableclass;

import java.util.HashMap;
import java.util.Map;

public class ImmutableClassMain {

  //in java trim() subString(), replace() are immutable class
  public static void main(String[] args) throws CloneNotSupportedException {
    Department department = new Department();
    department.setName("CSC");
    department.setMajor("JAVA");

    Map<String, String> map = new HashMap<>();
    map.put("name", "john");
    map.put("id", "12");

    Student s = new Student(12, "john", department, map);

    System.out.println("Department Name before modification = " + s.getDepartment().getName());
    //this will set the value inside the Department of EagerStudent
    //to avoid this we have to clone the department, so that value can never be changed
    department.setName("MECH");
    System.out.println("Department Name after modification = " + s.getDepartment().getName());

    System.out.println("Map Elements before modification");
    s.getMap().forEach((s1, s2) -> System.out.println(s1 + " - " + s2));

    map.put("department", "CSC");
    System.out.println("Map Elements after modification");
    s.getMap().forEach((s1, s2) -> System.out.println(s1 + " - " + s2));
  }
}