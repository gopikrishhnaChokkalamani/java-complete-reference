package com.main.java.designpatterns.creational.prototype;

public class ProtoypeMain {

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
    System.out.println("\nActual Object");
    student.getStudents().stream().forEach(System.out::println);
  }
}
