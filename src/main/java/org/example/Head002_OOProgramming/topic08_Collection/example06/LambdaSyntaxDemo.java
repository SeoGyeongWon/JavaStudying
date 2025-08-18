package org.example.Head002_OOProgramming.topic08_Collection.example06;


@FunctionalInterface
interface Calculator{
  int operate(int x, int y);
}

public class LambdaSyntaxDemo {
  public static void main(String[] args) {

    // 단일 명령문
    Calculator add = (x,y) -> x+y;
    Calculator multiple = (x,y) -> x*y;


    //여러줄 블록
    Calculator subtract = (x,y) ->{
      System.out.println("subtracting...");
      return x-y;
    };

    Calculator divide = (x,y) -> {
      System.out.println("dividing...");
      return x/y;
    } ;

    System.out.println("3 + 5 = "+add.operate(3,5));
    System.out.println("8 - 2 = "+subtract.operate(8,2));

    System.out.println("3 * 5 = "+multiple.operate(3,5));

    System.out.println("8 / 2 = "+divide.operate(8,2));
  }
}
