package com.main.java.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Student implements Cloneable {

  private List<String> students;

  public Student() {
    students = new ArrayList<>();
  }

  public Student(List<String> students) {
    this.students = students;
  }

  public List<String> getStudents() {
    return students;
  }

  public void load() {
    students.add("john");
    students.add("mary");
    students.add("sam");
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    List<String> tmp = new ArrayList<>();
    for (String s : this.getStudents()) {
      tmp.add(s);
    }
    return new Student(tmp);
  }
}
