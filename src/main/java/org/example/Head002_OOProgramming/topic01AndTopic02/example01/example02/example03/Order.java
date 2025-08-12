package org.example.Head002_OOProgramming.topic01AndTopic02.example01.example02.example03;

import java.util.ArrayList;
import java.util.List;

public class Order {
  private String orderId;
  private List<Product> products;
  private boolean isPaid;

  //기본 생성자
  public Order(){
    this.orderId = "none";
    this.products = new ArrayList<>();
    this.isPaid = false;

  }
  //오버로딩된 생성자
  public Order(String orderId, List<Product> products) {
      this.orderId = orderId;
      this.products = products;
      this.isPaid = false;
    }
    //상품 목록만 전달받는 생성자
  public Order(List<Product> products) {
    this.orderId = "none";
    this.products = products;
    this.isPaid = false;
  }
  // this() 호출 예시, orderId 전달받는 생성자
    public Order(String orderId){
    this(orderId, new ArrayList<>());
    }


  public String getOrderId() {
    return orderId;
  }

  public List<Product> getProducts() {
    return products;
  }


  public boolean isPaid() {
    return isPaid;
  }


}
