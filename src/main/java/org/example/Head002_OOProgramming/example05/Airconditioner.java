package org.example.Head002_OOProgramming.example05;

public class Airconditioner {
  public static void main(String[] args){
    Aircon aircon = new Aircon("Samsung",22,15);

    aircon.powerStatement();
    aircon.turnOn();
    aircon.powerStatement();
    aircon.turnOff();
    aircon.upTemper();
    aircon.downTemper();
    aircon.downTemper();
    aircon.nowHumidity();

    System.out.println(aircon);
  }
}
class Aircon{
  private String brand;
  private int temperature;
  private int humidity;
  private boolean power;

  Aircon(String brand, int temperature, int humidity ){
    this.brand = brand;
    this.temperature = temperature;
    this.humidity = humidity;
    this.power =false;
  }

  public boolean turnOn(){
    System.out.println("전원을 켭니다.");
    return power = true;

  }
  public boolean turnOff(){
    System.out.println("전원을 끕니다.");
    return power = false;
  }
  public void powerStatement() {
    if (power) {
      System.out.println("전원이 켜져있습니다.");
    } else {
      System.out.println("전원이 꺼져있습니다.");
    }
  }


  public void upTemper(){
    ++temperature;
    System.out.println("온도를 올립니다. 설정 온도: "+temperature);
  }
  public void downTemper(){
    --temperature;
    System.out.println("온도를 내립니다. 설정 온도: "+temperature);
  }

  public void nowHumidity(){
    System.out.println("현재의 습도는: "+humidity);
  }


  @Override
  public String toString() {
    return "Aircon{" +
        "brand='" + brand + '\'' +
        ", temperature=" + temperature +
        ", humidity=" + humidity +
        ", power=" + power +
        '}';
  }
}
