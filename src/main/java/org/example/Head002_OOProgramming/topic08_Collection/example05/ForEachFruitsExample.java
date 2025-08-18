package org.example.Head002_OOProgramming.topic08_Collection.example05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachFruitsExample {
  public static void main(String[] args) {
    List<String> fruits = List.of("Apple","Banana","Cherry");

    Consumer<String> printConsumer = new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println("Fruit: "+s);
      }
    };
    Stream<String> fruitStream = fruits.stream();
    fruitStream.forEach(printConsumer);
  }
}
