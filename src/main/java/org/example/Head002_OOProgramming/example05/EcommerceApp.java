package org.example.Head002_OOProgramming.example05;

import static org.example.Head002_OOProgramming.example05.Utility.applyDiscount;

public class EcommerceApp {
  public static void main(String[] args) {
    double orginalPrice = 100.0;
    double finalPrice = applyDiscount(orginalPrice);
    System.out.println("할인 적용된 가격: "+finalPrice);
  }

}
