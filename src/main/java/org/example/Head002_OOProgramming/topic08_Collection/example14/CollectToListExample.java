package org.example.Head002_OOProgramming.topic08_Collection.example14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/// 가장 단순하고 자주 쓰이는 수집 방법으로, 스트림 결과를 List나 Set으로 모을 수 있다.
public class CollectToListExample {
  public static void main(String[] args){
    List<String> data = Arrays.asList("a","b","c","b");

    List<String> result =data.stream()
        .distinct()
        .collect(Collectors.toList());
    System.out.println("Result list: "+result);
  }
}
