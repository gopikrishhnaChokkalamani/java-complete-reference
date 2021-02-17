package com.main.java.enumeration;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum Subject {

  CHEMISTRY("chemistr", true),

  PHYSCIS("physcis", true),

  MATHEMATICS("mathematics", false),

  ENGLISH("english", false),

  COMPUTERSCIENCE("computerscience", true);

  private String name;

  private boolean lab;

  Subject(String name, boolean lab) {
    this.name = name;
    this.lab = lab;
  }

  public String getName() {
    return name;
  }

  public boolean hasLab() {
    return lab;
  }

  private static final Map<String, Subject> SUBJECTS = Arrays.stream(values()).collect(Collectors.toMap(Subject::getName, Function.identity()));

  public static Subject lookup(String name) {
    return SUBJECTS.get(name);
  }
}
