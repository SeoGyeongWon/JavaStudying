package org.example.Head002_OOProgramming.topic08_Collection.example05;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapEntryTransformationExample {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Kim", 90);
    map.put("Lee", 85);
    map.put("Park", 02);


    //Map.Entry<String,Integer> -> 문자열 변환
    Function<Map.Entry<String,Integer>, String> entryToString =
        new Function<Map.Entry<String,Integer>, String>() {
      @Override
          public String apply(Map.Entry<String,Integer> entry) {
        return entry.getKey() + ": " + entry.getValue();
      }
        };
    map.entrySet().stream()
        .map(entryToString)
        .forEach(result -> System.out.println("Student Info: "+result));
  }
}
