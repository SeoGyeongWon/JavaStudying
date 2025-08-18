package org.example.Head002_OOProgramming.topic08_Collection.example02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
  public static void main(String[] args){
    Set<String > set = new HashSet<>();

    //요소 추가
    set.add("Korea");
    set.add("Japan");
    set.add("China");
    set.add("Korea"); // 중복된 요소는 저장되지 않음

    // 요소 포함 여부 확인
    System.out.println("Contain's Japan?: "+ set.contains("Japan"));

    // 요소 제거
    set.remove("China");
    System.out.println("After remove China: " + set);

    // 개수 확인
    System.out.println("Set size: "+set.size());

    // 전체 제거
    set.clear();
    System.out.println("After clear: " + set);
  }
}
