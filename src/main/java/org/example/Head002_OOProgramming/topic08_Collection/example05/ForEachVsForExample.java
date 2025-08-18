package org.example.Head002_OOProgramming.topic08_Collection.example05;

import java.util.Arrays;
import java.util.List;

public class ForEachVsForExample {
  public static void main(String[] args) {
    List<Integer> list  = Arrays.asList(1,2,3,4,5,6);

    /// 전통적인 for  ---> 인덱스를 활용할때 전통적인 for 문 사용
    System.out.println("=== Using for loop ===");
    for(int i = 0; i<list.size();i++){
      if(list.get(i) % 2 !=0){
        continue; /// 홀수 건너 뛰기
      }
      System.out.println("Even number: "+list.get(i));
    }

    ///  향상된 for ---> 단순한 순회 + 값만 빠르게 꺼내 쓸때(인덱스 필요 x)

    System.out.println("=== Using enhanced loop ===");
    for(int a : list){
      if(a % 2 != 0){
        continue;
      }
      System.out.println("Even number: "+a);
    }

    ///  스트림 forEach ---> spring 병렬처리 할때 유용 , 코드의 명확하게 드러내고 싶을때
    System.out.println("=== Using Stream filtert + foreach ===");
    list.stream()
        .filter(e -> e%2 == 0)
        .forEach(n-> System.out.println("Even number: "+ n));
  }
}
