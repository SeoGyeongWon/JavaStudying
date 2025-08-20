package org.example.Head002_OOProgramming.topic08_Collection.example14;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetExample
     {
  public static void main(String[] args){
    List<String> fruits = Arrays.asList("Apple","Banana","Apple","Cherry","Banana");

    Set<String> uniqueFruits = fruits.stream()
        .collect(Collectors.toSet());

    System.out.println("Unique fruits: "+ uniqueFruits);

  }
}
