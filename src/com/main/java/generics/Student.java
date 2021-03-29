package com.main.java.generics;

import com.main.java.interfaces.MarkerInterfaceExample;

import java.io.Serializable;
import java.util.List;

public class Student<T extends List & Serializable & Cloneable> {

  public void print(T req) {
    req.stream().forEach(System.out::println);
  }
}