package org.example.Head002_OOProgramming.topic05_InnerClass.example01;

public class StaticNested {
  public static void main(String[] args){
    ///  아우터의! 스태틱 네스티드 (아우터의 객체화 없이 접근할 수 없음)
    Outer.StaticNested nested = new Outer.StaticNested();
    nested.printValue();
    /// 스태틱 밸류를 넣어씅니 100이뜸
  }
}


class Outer{ /// 외부 클래스
  private static int staticValue = 100;
  private int instanceValue = 50;
  
  //정적 중첩 클래스
  public static class StaticNested {
    public void printValue(){
    /// . 은 시스템 의! (의!)느낌을 가짐 -> 아웃 의! 프린트함수
    System.out.println("Outer.statcivalue: "+staticValue);
    ///instanceValue를 쓰고자 하면
    /// Non-static field 'instanceValue' cannot be referenced from a static context 참조 할 수없는 오류
  }
  }
}