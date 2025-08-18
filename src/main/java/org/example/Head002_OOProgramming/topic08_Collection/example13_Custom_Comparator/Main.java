package org.example.Head002_OOProgramming.topic08_Collection.example13_Custom_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    List<Person> list = new ArrayList<>();
    list.add(new Person("Jack",30));
    list.add(new Person("John",25));
    list.add(new Person("Bob",20));
    list.add(new Person("David",40));

    System.out.println("=== 정렬 전 (원본 리스트) ====");
    System.out.println(list);

    /*List<Person> sortedByAge = list.stream()
        .sorted(
            Comparator
                .comparingInt(Person::getAge)
                .thenComparing(Person::getName)
        )

        .collect(Collectors.toList());
    System.out.println("=== 나이 기준 오름차순 정렬 + 사전순 정렬(Stream + PersonAgeComparator ===");
    System.out.println(sortedByAge);*/

    List<Person> sortedByAge = list.stream()
        .sorted(new PersonAgeComparator())
        .collect(Collectors.toList());
    System.out.println("=== 나이 기준 오름차순 정렬 (Stream + PersonAgeComparator ===");
    System.out.println(sortedByAge);
  }
}
