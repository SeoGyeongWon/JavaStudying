package org.example.Head002_OOProgramming.topic08_Collection.example05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapNamesExample {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("Alice","Bob","Charlie");

    Function<String,Integer> nameLength = new Function<String,Integer>(){
      @Override
      public Integer apply(String name) {
        return name.length();
      }
    };

    list.stream().map(nameLength).forEach(length -> System.out.println("Name length: "+ length));
  }
}
