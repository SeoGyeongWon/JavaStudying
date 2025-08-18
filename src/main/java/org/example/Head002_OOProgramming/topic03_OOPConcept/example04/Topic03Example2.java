package org.example.Head002_OOProgramming.topic03_OOPConcept.example04;

abstract class AbstractPayment{

  public abstract void pay(double amount);
/**
   * 이 취소는 공통으로 취소되는것 밖에 없으니 하나로 묶는게 나앗을듯
   *  public void cancel(double amount){System.out.println("취소");}
   * */


  public abstract void cancel(double amount);

}

class CreditCardPayment extends AbstractPayment{
  @Override
  public void pay(double amount) {
    System.out.println("신용카드로 " + amount + "원 결제 완료.");
  }

  @Override
  public void cancel(double amount) {
    System.out.println(amount+ "원이 결제 취소되었습니다.");
  }


}

class AccountTransferPayment extends AbstractPayment{
  @Override
  public void pay(double amount) {
    System.out.println("계좌이체로 " + amount + "원 결제 완료.");
  }
  @Override
  public void cancel(double amount) {
    System.out.println(amount+"원이 이체 취소되었습니다.");
  }
}
class CryptoPayment extends AbstractPayment{
  @Override
  public void pay(double amount) {
    System.out.println("암호화폐로" + amount +"개 결제 완료");
  }
  @Override
  public void cancel(double amount) {
    System.out.println(amount +"개 암호화폐 결제 취소");
  }
}


class Order2{
  private AbstractPayment ap;
  public Order2(AbstractPayment ap){
    this.ap = ap;
  }

  public void process(double amount){
    ap.pay(amount);
  }
}

public class Topic03Example2{
  public static void main(String[] args){
    Order2 or = new Order2(new CryptoPayment());
    or.process(20000);
  }
}
