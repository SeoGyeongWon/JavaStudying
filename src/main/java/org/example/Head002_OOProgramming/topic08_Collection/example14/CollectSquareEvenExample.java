package org.example.Head002_OOProgramming.topic08_Collection.example14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/// 숫자 목록에서 짝수만 골라(filter), 제곱으로 변환(map), 중복을 제거(distinct), 그리고 결과를 리스트로 모은다(collect).
public class CollectSquareEvenExample {
  public static void main(String[] args){
    List<Integer> numbers = Arrays.asList(2,4,4,5,10,2);

    List<Integer> processed = numbers.stream()
        .filter(n -> n%2 ==0)
        .map(n -> n*n)
        .distinct()
        .collect(Collectors.toList());

    System.out.println("Processed List "+processed);
  }
}
