package com.main.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

  private static final long serialVersionUID = 1L;

  int id;

  String name;

  //will not be serialized will have default value
  transient int age;

  // value will not be serialized, but will load the current value after deserialization
  static transient int dob;

  transient String department;

  String subject;

  @Override
  public String toString() {
    return "EagerStudent{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", dob=" + dob +", department=" + department
            +", subject=" + subject + '}';
  }
}
public class SerializationMain {

  public static void main(String[] args) {
    Student s = new Student();
    s.name = "john";
    s.id = 12345;
    s.age = 12;
    s.dob = 20101010;
    s.department = "computer science";
    s.subject = "Data Structures and Algorithms";
    System.out.println("Before Serialization, Current Object : " + s.toString());
    String fileName = "serialize.txt";

    try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fileName))) {
      o.writeObject(s);
      //s.dob = 20101010;
      System.out.println("After Serialization, Current Object : " + s.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println();

    try (ObjectInputStream o = new ObjectInputStream(new FileInputStream(fileName))) {
      Student student = (Student)o.readObject();
      System.out.println("After DeSerialization, New Object : " + student.toString());
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
