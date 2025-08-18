package org.example.Head002_OOProgramming.topic01AndTopic02;

public class Product {
  private String productId;
  private String productName;
  private double productPrice;

  public  Product(String productId, String productName, double productPrice) {
    this.productId = productId;
    this.productName = productName;
    this.productPrice = productPrice;

  }

  public String getProductId() {
    return productId;
  }

  public double getProductPrice() {
    return productPrice;
  }


  public String getProductName() {
    return productName;
  }
}
