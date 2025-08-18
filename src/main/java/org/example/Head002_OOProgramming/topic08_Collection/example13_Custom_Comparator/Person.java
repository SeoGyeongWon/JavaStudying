package org.example.Head002_OOProgramming.topic08_Collection.example13_Custom_Comparator;

public class Person {
  String name;
  int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  @Override
  public String toString(){
    return "Person {"+name+","+age+"}";
  }
}
