package org.example.Head002_OOProgramming.topic05_InnerClass.example02;

public class NonstaticInner {
  public static void main(String[] args){
  ///  비정적 내부 클래스를 사용하기 위해서 외부 클래스의 객체부터 생성
    Outer outer =new Outer();
    Outer.Inner inner =  outer. new Inner();
    inner.printInstanceValue();;
  }
}
class Outer{
  private int instanceValue = 200;

  /// 비 정적 내부 클래스
  public class Inner{
    public void printInstanceValue(){
      System.out.println("Outer InstanceValue: "+instanceValue);
    }
  }
}


