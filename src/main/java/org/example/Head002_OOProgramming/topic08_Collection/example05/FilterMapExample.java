package org.example.Head002_OOProgramming.topic08_Collection.example05;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class FilterMapExample {
  public static void main(String[] args){

    Map<String, Integer> map = new HashMap<>();
    map.put("Kim", 90);
    map.put("Lee", 75);
    map.put("park",88);

    Predicate<Map.Entry<String, Integer>> predicate = new Predicate<Map.Entry<String, Integer>>() {
      @Override
      public boolean test(Map.Entry<String, Integer> entry) {
        return entry.getValue()>=80;
      }
    };
    map.entrySet().stream()
        .filter(predicate)
        .forEach(entry -> System.out.println("High score: " +entry.getKey()+ "=>"+entry.getValue()));
  }
}
