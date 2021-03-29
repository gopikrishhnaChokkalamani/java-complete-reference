package com.main.java.designpatterns.creational.prototype;

public class ProtoypeMain {

  //think of chess game
  //initial setup of the board
  //everything is preloaded, just use that object
  public static void main(String[] args) throws CloneNotSupportedException {
    Student student = new Student();
    student.load();
    System.out.println("Actual Object");
    student.getStudents().stream().forEach(System.out::println);
    System.out.println("\nCloned");
    Student newStudent = (Student) student.clone();
    newStudent.getStudents().stream().forEach(System.out::println);
    System.out.println("\nModification on Cloned");
    newStudent.getStudents().add("jacob");
    newStudent.getStudents().stream().forEach(System.out::println);
    System.out.println("\nActual Object Does not change");
    student.getStudents().stream().forEach(System.out::println);
  }
}
