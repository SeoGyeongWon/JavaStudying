package org.example.Head002_OOProgramming.topic08_Collection.example13_Custom_Comparator;

import java.util.Comparator;

public class PersonAgeComparator  implements Comparator<Person> {
  @Override
  public int compare(Person o1, Person o2) {
    // 나이를 비교할 때는 단순히 정수 비교 수행
    // p1이 작으면 음수, 같으면 0, 크면 양수 반환
    return Integer.compare(o1.getAge(), o2.getAge());
  }
}
