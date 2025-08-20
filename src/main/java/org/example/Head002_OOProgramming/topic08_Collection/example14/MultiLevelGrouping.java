package org.example.Head002_OOProgramming.topic08_Collection.example14;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
  String name;
  String dept;
  String position;

  public Employee(String name ,String dept, String position){
    this.dept = dept;
    this.position = position;
    this.name = name;
  }

  public String getDept(){
    return dept;

  }
  public String getPosition(){
    return position;
  }
  @Override
  public String toString(){
    return name + "(" + position + ", " + dept + ")";
  }
}

public class MultiLevelGrouping {
  public static void main(String[] args) {
    List<Employee> emps = Arrays.asList(
        new Employee("Alice", "Manager", "HR"),
        new Employee("Bob", "Developer", "IT"),
        new Employee("Charlie", "Developer", "IT"),
        new Employee("David", "Manager", "Sales"),
        new Employee("Eve", "Developer", "Sales")
    );
    Map<String,Map<String, List<Employee>>> multiGroup = emps.stream()
        .collect(
            Collectors.groupingBy(
                Employee::getPosition,
                Collectors.groupingBy(Employee::getDept)
            )
        );
    System.out.println(multiGroup);
  }
}
