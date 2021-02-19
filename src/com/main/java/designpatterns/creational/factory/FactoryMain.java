package com.main.java.designpatterns.creational.factory;

public class FactoryMain {

  //advantage is u can create multiple client implementations without affecting much of the code
  //in this example if i have to add some class Worker
  //all i ahave to do is chage the enum, and create an implementation of worker extending the user
  //and the code will work without any issues
  //simplifies the task of creating objects
  public static void main(String[] args) {
    User student = Factory.getUser(UserType.STUDENT);
    System.out.println(student.getDetails());

    User staff = Factory.getUser(UserType.STAFF);
    System.out.println(staff.getDetails());

    User teacher = Factory.getUser(UserType.TEACHER);
    System.out.println(teacher.getDetails());
  }
}
