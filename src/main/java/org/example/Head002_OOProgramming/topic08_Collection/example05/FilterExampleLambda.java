package org.example.Head002_OOProgramming.topic08_Collection.example05;

import java.util.ArrayList;
import java.util.List;

public class FilterExampleLambda {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(15);
    list.add(20);
    list.add(25);
    list.add(30);

    ///  람다 표현식으로 Predicate 구현
    list.stream()
        .filter(num -> num % 2==0)
        .forEach(num -> System.out.println("Even number: "+ num));
  }
}
