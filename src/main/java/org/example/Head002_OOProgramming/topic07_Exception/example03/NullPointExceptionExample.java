package org.example.Head002_OOProgramming.topic07_Exception.example03;

import java.io.IOException;

public class NullPointExceptionExample {
  public static void main(String[] args) throws IOException {
    printStr(null);
    // printStr("안녕하세요");
  }
    public static void printStr(String str){
      try{
        System.out.println(str.toUpperCase());
      }catch (NullPointerException e){
        System.out.println("예외 발생: str이 null입니다.");
        System.out.println(e.getMessage());
        System.out.println(e.toString());
      }
      finally{
        System.out.println(" finally 블록 실행됌");
      }
    }

}
