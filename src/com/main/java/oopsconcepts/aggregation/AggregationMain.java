package com.main.java.oopsconcepts.aggregation;

import java.util.Arrays;
import java.util.Map;

public class AggregationMain {

  // Has a Relation, Department has students
  // its uni directional, students cannot have department
  //department will be there even if students are not there
  //Weak Relation
  public static void main(String[] args) {
    Department d = new Department();
    d.name = "computer science";
    d.students = Arrays.asList(new Student("john", 12), new Student("mary", 12));

    System.out.println("List of Students in Department : " + d.name);
    for (Student s : d.students) {
      System.out.println("Name : " + s.name + ", age : " + s.age);
    }
  }
}
