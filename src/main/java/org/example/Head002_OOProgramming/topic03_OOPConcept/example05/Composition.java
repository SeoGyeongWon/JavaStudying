package org.example.Head002_OOProgramming.topic03_OOPConcept.example05;

public class Composition {

}

class Delivery{
  private String trackingNumber;// 송장 번호
  private String carrier;//

  public Delivery(String trackingNumber, String carrier){
    this.trackingNumber = trackingNumber;
    this.carrier = carrier;
  }
  public void startDelivery(){
    System.out.println("배송 시작 - 운송장 번호: " + trackingNumber);
  }
}
class Order{
  private String orderId;
  private Delivery delivery;

  public Order(String orderId, String trackingNumber, String carrier){
    this.orderId = orderId;
    this.delivery = new Delivery(trackingNumber, carrier);
  }
  public void startOrderDelivery(){
    if(delivery != null){
      delivery.startDelivery();
    }
    else{
      System.out.println("배송 정보가 없습니다.");
    }
  }
}
