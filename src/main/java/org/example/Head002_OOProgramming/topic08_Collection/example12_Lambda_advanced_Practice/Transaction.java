package org.example.Head002_OOProgramming.topic08_Collection.example12_Lambda_advanced_Practice;

public class Transaction {
  private int id;
  private String type;
  private double amount;

  public Transaction(int id, String type, double amount) {
    this.id = id;
    this.type = type;
    this.amount = amount;
  }

  public int getId() {
    return id;
  }
  public String getType() {
    return type;
  }
  public double getAmount()
  {
    return amount;
  }
  @Override
  public String toString(){
    return "Transaction{" +"id= "+id+
        ", type=' "+type +'\'' + ",amount= "+amount+'}';
  }
}
