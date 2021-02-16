package com.main.java.oopsconcepts.encapsulation;

import java.io.Serializable;

public class Student implements Serializable {

  //variable is hidden to the caller and he is forced to use only get and set method
  //what happens in get or set is hidden to the actual caller
  private String name;

  private String age;

  private String Department;

  //what happens in get or set is hidden to the actual caller
  public String getName() {
    return name + "hello";
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getDepartment() {
    return Department;
  }

  public void setDepartment(String department) {
    Department = department;
  }
}
