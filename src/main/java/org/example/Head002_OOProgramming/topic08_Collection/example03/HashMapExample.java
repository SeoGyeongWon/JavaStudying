package org.example.Head002_OOProgramming.topic08_Collection.example03;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    /// 키 - 값 쌍 추가
    map.put("Kim",90);
    map.put("Lee",85);
    map.put("Park",95);
    System.out.println("After put: "+ map);

    /// 기존 키에 다른 값 할당
    map.put("Lee",88);
    System.out.println("After updating 'Lee' : "+ map);

    /// 특정 키의 값 조회
    int parkScore = map.get("Park");
    System.out.println("After park's score : "+ parkScore);

    ///  키 존재 여부 확인
    System.out.println("Contains 'Kim' : "+map.containsKey("Kim"));
    /// 요소 제거
    map.remove("Kim");
    System.out.println("After removing 'Kim' : "+ map);

    /// 모든 키 조회
    System.out.println("All keys: "+map);
  }
}
