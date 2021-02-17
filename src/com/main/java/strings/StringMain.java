package com.main.java.strings;

public class StringMain {

  public static void main(String[] args) {
    //Strings are placed in constant pool
    //so if you create another string s2 it does not create another instance but
    //rather points s2 reference of s1, so no new string onject will be created
    //which does not mean when you change the value of s2 s1 will also change
    String s1 = "john";
    String s2 = "john";

    //this will create on heap memory, so avoid it
    String s = new String("mary");

    //thread safe
    StringBuffer buf = new StringBuffer();

    //not thread safe, so more efficient that string buffer
    StringBuilder sb = new StringBuilder();
  }
}
