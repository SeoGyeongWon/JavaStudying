package org.example.Head002_OOProgramming.topic08_Collection.example05;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachMapExample {
  public static void main(String[] args){
    Map<String, Integer> scores = new HashMap<>();
    scores.put("Kim", 90);
    scores.put("Lee", 85);
    scores.put("Park", 92);

    Consumer<Map.Entry<String, Integer>> printEntry =
        new Consumer<Map.Entry<String, Integer>>() {
      @Override
      public void accept(Map.Entry<String, Integer> entry) {
        System.out.println("Key: " +entry.getKey()+", Value: "+entry.getValue());
      }
    };
    scores.entrySet().stream().forEach(printEntry);
    System.out.println(scores);
  }
}
