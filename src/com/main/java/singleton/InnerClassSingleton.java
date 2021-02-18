package com.main.java.singleton;

public class InnerClassSingleton {

  private InnerClassSingleton() {}

  private static class InnerClassSingletonHelper {
    private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
  }

  //this private static class is not loaded intp memory, only when someone class this class gets loaded
  // and creates singleton class instance
  //most widely used
  //as we dont need snchronization
  public static InnerClassSingleton getInstance() {
    return InnerClassSingletonHelper.INSTANCE;
  }
}
