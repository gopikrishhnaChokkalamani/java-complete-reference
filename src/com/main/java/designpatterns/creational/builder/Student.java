package com.main.java.designpatterns.creational.builder;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {

  private static final long serialVersionUID = 1L;

  private long id;

  private String name;

  private String department;

  private List<String> subjects;

  private Student(Builder builder) {
    this.id = builder.id;
    this.department = builder.department;
    this.name = builder.name;
    this.subjects = builder.subjects;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public List<String> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<String> subjects) {
    this.subjects = subjects;
  }

  public static class Builder {

    private long id;

    private String name;

    private String department;

    private List<String> subjects;

    public Builder(long id) {
      this.id = id;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder fromDepartment(String department) {
      this.department = department;
      return this;
    }

    public Builder hasSubjects(List<String> subjects) {
      this.subjects = subjects;
      return this;
    }

    public Student build() {
      return new Student(this);
    }
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", department='" + department + '\'' +
            ", subjects=" + subjects +
            '}';
  }
}
