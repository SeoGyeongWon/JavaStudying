package org.example.Head002_OOProgramming.topic06_Enum.example01;

public class EnumBasicTest {
  public enum Level{
    LOW, MEDIUM, HIGH
  }

  // 객체가 필요없는듯 이 클래스는
  public static void main(String[] args){
    for(Level lev : Level.values()){
      System.out.println(lev + " ordinal= "+ lev.ordinal());
    }

    Level today = Level.MEDIUM;
    System.out.println("name(): "+today.name());
  }
}
