package org.example.Head002_OOProgramming.topic08_Collection.example05;

import java.util.HashMap;
import java.util.Map;

public class EntrySetBasicExample {
  public static void main(String[] args){
    Map<String, String> map = new HashMap<>();
    map.put("Korea","Seoul");
    map.put("Japan","Tokyo");
    map.put("USA","Washington D.C");

    ///  Entryset 치환
    for(Map.Entry<String, String> entry : map.entrySet()){
      System.out.println("Country:" + entry.getKey()+" => " +"Capital "+entry.getValue());
    }
  }
}
