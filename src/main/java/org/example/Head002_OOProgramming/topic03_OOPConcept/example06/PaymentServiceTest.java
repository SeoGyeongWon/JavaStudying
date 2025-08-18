package org.example.Head002_OOProgramming.topic03_OOPConcept.example06;

 class UserAccount {
  private final String accountId;
  private double balance;

  public UserAccount(String accountId) {
    this.accountId = accountId;
    this.balance = 0;
  }

  public String getAccountId() {
    return accountId;
  }

  public double getBalance(double balance) {
    return balance;
  }
  public void deposit(double amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("0보다 커야합니다.");
    }
    balance += amount;
  }
    public void withdraw(double amount){
      if(amount <= 0 || balance < amount){throw new IllegalArgumentException("출금 오류."); }
      balance -= amount;
    }
    public double getBalance() {
    return balance;
    }
}

 class PaymentServie{

   public void processPayment(UserAccount acc, double amount){
    acc.withdraw(amount);
    System.out.println("결제 완료. 잔액: "+acc.getBalance());
  }

  public void processRefund(UserAccount acc, double amount){
    acc.deposit(amount);
    System.out.println("환불 완료. 잔액: "+ acc.getBalance());
  }
}

public class PaymentServiceTest {
  public static void main(String[] args) {
    UserAccount ucc = new UserAccount("acc001");
    PaymentServie ps = new PaymentServie();

    ucc.deposit(10000);
    System.out.println("초기 입금 완료. 잔액: "+ucc.getBalance());

    //1. 음수 입금 테스트
    try{
      ucc.deposit(-5000);
    }catch (IllegalArgumentException e){
      System.out.println("예외 발생(음수 입금). 입력 명: "+e.getMessage());
    }

    //2. 음수 출금 테스트
    try{
      ps.processPayment(ucc,-5000);
    }catch (IllegalArgumentException e){
      System.out.println("예외 발생(음수 출금). 입력 명:"+e.getMessage());
    }

    //3.  잔액 부족 출금 테스트
    try{
      ps.processRefund(ucc,5000);
    }catch (IllegalArgumentException e){
      System.out.println("예외 발생(잔액 부족):" + e.getMessage());
    }

    //4. 정상 결제 + 환불
      ps.processPayment(ucc,3000);
      ps.processRefund(ucc,3000);
  }
}