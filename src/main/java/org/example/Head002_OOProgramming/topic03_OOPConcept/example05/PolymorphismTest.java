package org.example.Head002_OOProgramming.topic03_OOPConcept.example05;



interface Payment{
  void pay(double amount);

}

class CreditCardPayment implements Payment{
  @Override
  public void pay(double amount) {
    System.out.println("신용카드로 " + amount + "원 결제 완료.");
  }

}

class AccountTransferPayment implements Payment{
  @Override
  public void pay(double amount) {
    System.out.println("계좌이체로 " + amount + "원 결제 완료.");
  }

}
class CryptoPayment implements Payment {
  @Override
  public void pay(double amount) {
    System.out.println("암호화폐로" + amount +"개 결제 완료");

  }
}


public class PolymorphismTest {
  public static void main(String[] args){
    Payment[] p = {
        new CreditCardPayment(),
        new AccountTransferPayment(),
        new CryptoPayment()
    };

    double[] pAmount = {30000,70000,100000};

    OrderService service = new OrderService();
    for(Payment payment : p){
      if(payment instanceof CreditCardPayment){
      service.processPayment(payment, pAmount[0]);
      }
      else if(payment instanceof AccountTransferPayment){
        service.processPayment(payment, pAmount[1]);
      }
      else if(payment instanceof CryptoPayment){
        service.processPayment(payment, pAmount[2]);
      }
      else{
        service.processPayment(payment, pAmount[1000]);
      }
    }
  }
}


class OrderService{
  public void processPayment(Payment method, double amount){
    method.pay(amount);
  }
}
