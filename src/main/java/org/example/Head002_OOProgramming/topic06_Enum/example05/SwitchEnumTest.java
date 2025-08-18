package org.example.Head002_OOProgramming.topic06_Enum.example05;



enum PaymentMethod{
  CREDIT_CARD("신용카드"),
  ACCOUNT_TRANSFER("계좌이체"),
  MOBILE_PAYMENT("모바일결제");

  private final String displayName;

  PaymentMethod(String displayName){
    this.displayName = displayName;
  }
  public String getDisplayName(){
    return displayName;
  }
}
public class SwitchEnumTest {
  public static void main(String[] args){
    PaymentMethod pm = PaymentMethod.ACCOUNT_TRANSFER;

    switch (pm){
      case CREDIT_CARD:
        System.out.println("신용카드 결제 선택: "+ pm.getDisplayName());
        break;

      case ACCOUNT_TRANSFER:
        System.out.println("계좌이체 결제 선택: "+ pm.getDisplayName());
        break;
      case MOBILE_PAYMENT:
        System.out.println("모바일 결제 선택: "+pm.getDisplayName());
        break;
    }
  }
}