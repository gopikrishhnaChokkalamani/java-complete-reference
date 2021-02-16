package com.main.java.generics;

import java.io.Serializable;
import java.util.List;

public class Student<T extends List & Serializable>{

  public void print(T req) {
    req.stream().forEach(System.out::println);
  }
}