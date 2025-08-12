package org.example.Head002_OOProgramming.topic03_OOPConcept.example01;


public class CashPayment implements Payment {

  /**
   * 인터페이스를 안 쓸 경우
   * */
  // public void pay(double amount) {}

  @Override
  public void pay(double amount) {
    //현금 결제에 필요한 로직
    System.out.println("CashPayment " + amount + "\n");
  }
}
