package org.example.Head002_OOProgramming.topic08_Collection.example14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinAndMaxByExample {
  public static void main(String[] args) {
    List<String> fruits = Arrays.asList("Apple","Banana","Cherry");

    Optional<String> minFruits = fruits.stream()
        .collect(Collectors.minBy(Comparator.naturalOrder()));

    Optional<String> maxFruits = fruits.stream()
        .collect(Collectors.maxBy(Comparator.naturalOrder()));

    System.out.println("Lexicographcially smallest fruit: "+minFruits.orElse("None"));
    System.out.println("Lexicographcially biggest fruit: "+maxFruits.orElse("None"));
  }
}
