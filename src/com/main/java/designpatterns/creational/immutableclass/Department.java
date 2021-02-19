package com.main.java.designpatterns.creational.immutableclass;

//Fixing Mutable Object Department with Cloneable
public class Department implements Cloneable {
  
  private String name;
  
  private String major;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
