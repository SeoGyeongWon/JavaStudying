package org.example.Head002_OOProgramming.topic08_Collection.example14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {
  public static void main(String[] args) {
    List<String> name = Arrays.asList("Alice","Bob","Charlie");

    String result = name.stream()
        .collect(Collectors.joining(",")); ///구분자 쉼표
    System.out.println("Formatted result: "+result);
  }
}
