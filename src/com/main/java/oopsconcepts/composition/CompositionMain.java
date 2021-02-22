package com.main.java.oopsconcepts.composition;

import java.util.Arrays;

public class CompositionMain {

  //Part of relation
  //Books are part of library
  //if library has no books, then it cannot exist
  // Strong relation
  public static void main(String[] args) {
    Library l = new Library();
    l.name  = "Public Library";
    l.books = Arrays.asList(new Book("Silmirilion"), new Book("Hobbit UnExpected Journey"));

    System.out.println(l.name + " has the following books");
    for (Book b : l.books) {
      System.out.println(b.name);
    }
  }
}
