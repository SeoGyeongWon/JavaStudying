package org.example.Head002_OOProgramming.example05;

public class Utility {
  private static final double DISCOUNT_RATE;

  static {
    DISCOUNT_RATE = 0.05;
  }

  public static double applyDiscount(double price){
    return price -(price * DISCOUNT_RATE);
  }
}
