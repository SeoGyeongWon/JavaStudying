package org.example.Head002_OOProgramming.topic08_Collection.example07;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

    // 1. Consumer - 출력

    ///  stream을 안붙여도 됌 -> stream을 붙이는 이유가 list를 가져와서 다시 한번 거르겠다는 뜻으로
    ///  길이 5이상 필터링이나, 대문자로 바꾸는것은 list에서 가져와서 얘네를 다시한번 바꾸는것이지만
    ///  단순 출력은 그냥 가져와서 그대로 내보내면 되므로 stream이 빠져도 됌
    names.stream()
        .forEach(System.out::println);

    // 2. Predicate - 이름 길이 5 이상 필터링

    names.stream()
        .filter(s -> s.length() >=5)
        .forEach(System.out::println);

    // 3. Function - 이름을 대문자로 변환
    names.stream()
        .map(s ->s.toUpperCase())
        .forEach(System.out::println);
  }
}

