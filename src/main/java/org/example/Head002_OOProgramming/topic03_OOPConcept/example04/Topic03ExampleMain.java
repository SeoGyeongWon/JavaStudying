package org.example.Head002_OOProgramming.topic03_OOPConcept.example04;

interface Payment{
  void pay(double amount);
  void cancel(double amount);

}


class CreditCardPayment implements Payment{
  @Override
  public void pay(double amount) {
    System.out.println("신용카드로 " + amount + "원 결제 완료.");
  }
  @Override
  public void cancel(double amount) {
    System.out.println(amount+ "원이 결제 취소되었습니다.");
  }
}

class AccountTransferPayment implements Payment{
  @Override
  public void pay(double amount) {
    System.out.println("계좌이체로 " + amount + "원 결제 완료.");
  }
  @Override
  public void cancel(double amount) {
    System.out.println(amount+"원이 이체 취소되었습니다.");
  }
}
class CryptoPayment implements Payment{
  @Override
  public void pay(double amount) {
    System.out.println("암호화폐로" + amount +"개 결제 완료");
  }
  @Override
  public void cancel(double amount) {
    System.out.println(amount +"개 암호화폐 결제 취소");
  }
}

class Order{
  private Payment payment;

  public Order(Payment payment){
    this.payment = payment;
  }
  public void process(double amount){
    if(amount <=40000){
      payment.cancel(amount);
    }
    else{payment.pay(amount);}
  }
}
public class Topic03ExampleMain {
  public static void main(String[] args) {
    Order o1 = new Order(new CryptoPayment());
    o1.process(50000);

    Order o2 = new Order(new CryptoPayment());
    o2.process(30000);
  }
}
