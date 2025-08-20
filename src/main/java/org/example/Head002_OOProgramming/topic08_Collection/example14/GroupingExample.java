package org.example.Head002_OOProgramming.topic08_Collection.example14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Kim", "Lee", "Park", "Kang", "Choi", "Cha");

    Map<Character, List<String>> grouped = names.stream().collect(
        Collectors.groupingBy(n -> n.charAt(0))
    );
    System.out.println(grouped);
  }
}
