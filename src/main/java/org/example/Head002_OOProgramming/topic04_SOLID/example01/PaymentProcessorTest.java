package org.example.Head002_OOProgramming.topic04_SOLID.example01;

public class PaymentProcessorTest {
  public static void main(String[] args){
    Payment[] type = {
        new AccountTransferPayment(), new CreditCardPaymet(), new MobilePaymet()
    };

    double[] money = {10000,20000,2000};

    PaymentProcessor pp = new PaymentProcessor();

    /*int idx = 0;
    for(Payment payment: type){
      pp.pay(payment,money[idx++]);
    }*/

    for(Payment payment: type){
      if(payment instanceof CreditCardPaymet){
        pp.pay(payment, money[0]);
      }
      else if(payment instanceof MobilePaymet){
        pp.pay(payment, money[1]);
      }
      else if(payment instanceof AccountTransferPayment){
        pp.pay(payment, money[2]);
      }
      else{
        pp.pay(payment, money[100]);
      }
    }
  }
}

interface Payment{
  void pay(double amount);
}

class CreditCardPaymet implements Payment{
  @Override
  public void pay(double amount) {
    System.out.println("신용카드 결제: "+ amount +"원");
  }
}

class AccountTransferPayment implements Payment{
  @Override
  public void pay(double amount) {
    System.out.println("계좌이체 결제: "+ amount +"원");
  }
}

class MobilePaymet implements Payment{
  @Override
  public void pay(double amount) {
    System.out.println("모바일 결제: "+ amount +"원");
  }
}

class PaymentProcessor{
  public void pay(Payment payment, double amount){
    payment.pay(amount);
  }
}