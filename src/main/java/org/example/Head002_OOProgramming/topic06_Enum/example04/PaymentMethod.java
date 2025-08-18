package org.example.Head002_OOProgramming.topic06_Enum.example04;

public enum PaymentMethod {
  CREDIT_CARD("신용카드"),
  ACCOUNT_TRANSFER("계좌이체"),
  MOBILE_PAYMENT("모바일결제");

  private final String displayName;
  PaymentMethod(String displayName) {
    this.displayName = displayName;
  }
  public String getDisplayName(){
    return displayName;
  }
}

class PaymentMethodDemo{
  public static void main(String[] args) {
    for(PaymentMethod pm : PaymentMethod.values()){
      System.out.println(pm.name() + "=>"+pm.getDisplayName());
    }
  }
}
