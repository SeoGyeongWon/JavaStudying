package org.example.Head002_OOProgramming.topic08_Collection.example05;

import java.util.HashMap;
import java.util.Map;

public class FilterMapExampleLambda {
  public static void main(String[] args){
    Map<String,Integer> map = new HashMap<>();
    map.put("Kim", 90);
    map.put("Lee", 75);
    map.put("park",88);

    map.entrySet().stream()
        .filter(entry -> entry.getValue()>=80)
        .forEach(entry -> System.out.println("High score: "+ entry.getKey()+ " => "+entry.getValue()));
  }
}
