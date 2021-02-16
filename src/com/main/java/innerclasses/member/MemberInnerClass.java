package com.main.java.innerclasses.member;

public class MemberInnerClass {

  public class InnerClass {

    void message() {
      System.out.println("Inner Class message()");
    }
  }

  void message() {
    System.out.println("MemberInnerClass message()");
  }

  public static void main(String[] args) {
    MemberInnerClass m = new MemberInnerClass();
    m.message();
    MemberInnerClass.InnerClass ic = m.new InnerClass();
    ic.message();
  }
}
