package org.example.Head002_OOProgramming.topic05_InnerClass.example04;

abstract class AbstractTask{
  public abstract void execute();
  public void start(){
    System.out.println("Task 시작");
  }
}
public class AnonymousClassDemo {
  public static void main(String[] args) {
    //추상 클래스 익명 구현
    AbstractTask customTask = new AbstractTask() {
      @Override
      public void execute() {
        System.out.println("추상 크랠스의 execute() 구현부");
      }
    };
    customTask.start();
    customTask.execute();
  }
}
