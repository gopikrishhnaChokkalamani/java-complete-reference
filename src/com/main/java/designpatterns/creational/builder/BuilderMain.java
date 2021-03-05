package com.main.java.designpatterns.creational.builder;

import java.util.Arrays;
import java.util.List;

public class BuilderMain {

  //instead of creating the entire object, create wat u need
  //think of scenarios of a large object with lot of setters, do we need to lot of setters? (or)
  //sometimes u just need few to build the object, even though u can do it via constructor, how many constructors will u create?
  //creating the object in multiple ways
  public static void main(String[] args) {
    List<String> subjects = Arrays.asList("Data Structures", "Microprocessors", "Control Systems");
    Student student = new Student.Builder(1234567).name("john").fromDepartment("Computer Science").hasSubjects(subjects).build();
    System.out.println(student.toString());
  }
}
