package com.main.java.oopsconcepts.association;

public class AssociationMain {

  //creating relation between two different classes
  public static void main(String[] args) {
    Car car = new Car();
    car.name = "honda";
    car.model = "civic";

    Driver driver = new Driver();
    driver.name = "john";
    driver.age = 12;

    System.out.println(car.name + " " + car.model + " is driven by " + driver.name + " and his age is " + driver.age);
  }
}
