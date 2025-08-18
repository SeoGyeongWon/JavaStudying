package org.example.Head002_OOProgramming.topic07_Exception.example02;

public class RuntimeErrorExample {
  public static void main(String[] args){
    int[] score ={90,80,70};
    ///  Unchecked Exception -> 배열범위 초과
    System.out.println(score[3]);
  }
}
