package org.example.Head002_OOProgramming.topic03_OOPConcept.example02;

public abstract class AbstractPayment {
  // 공통 검증 로직
  protected  void validatePayment(double amount){
    if(amount<=0){
      throw new IllegalArgumentException("Amount must be greater than 0.");
    }
  }

  protected  void validateCancel(double amount){
    if(amount<=0){
      throw new IllegalArgumentException("Amount must be greater than 0.");
    }
  }

  public abstract void pay(double amount);
  public abstract void cancel(double amount);
}

class CreditCardPayment extends AbstractPayment{
  @Override
  public void pay(double amount) {
    validatePayment(amount);
    System.out.println("신용카드 결제 완료: "+amount);
  }

  @Override
  public void cancel(double amount) {
    validateCancel(amount);
     System.out.println("신용카드 결제 취소: "+amount);
  }
}

class AccountTransferPayment extends AbstractPayment{
  @Override
  public void pay(double amount) {
    validatePayment(amount);
    System.out.println("계좌이체 결제 완료: "+amount);
  }
  @Override
  public void cancel(double amount) {
    validateCancel(amount);
    System.out.println("계좌이체 결제취소: "+amount);
  }

}
