package org.example.Head002_OOProgramming.topic08_Collection.example05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterNumberExample {
  public static void main(String[] args){
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(15);
    list.add(20);
    list.add(25);
    list.add(30);

    ///  익명 클래스를 사용한 Predicate
    Predicate<Integer> isEven = new Predicate<Integer>() {
      @Override
      public boolean test(Integer value) {
        return value % 2== 0;
      }
    };
    Stream<Integer>  stream = list.stream();
    Stream<Integer> evenStream = stream.filter(isEven);
    //filter() 중간 연산

    evenStream.forEach(num -> System.out.println("Even number: " + num)); ///최종 연산

  }
}
