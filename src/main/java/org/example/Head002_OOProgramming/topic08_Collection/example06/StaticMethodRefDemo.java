package org.example.Head002_OOProgramming.topic08_Collection.example06;

import java.util.function.Function;

public class StaticMethodRefDemo {
  public static int doubleValue(int x){
    return x*2;
  }

  public static void main(String[] args){

    /// 람다 식
    /*Function<Integer,Integer> f =  num -> StaticMethodRefDemo.doubleValue(num);*/
     /// 정적 메서드 참조
    Function<Integer,Integer> f = StaticMethodRefDemo::doubleValue;

    System.out.println(f.apply(10));
  }
}
