package org.example.Head002_OOProgramming.topic08_Collection.example06;

/// 일반 클래스: 상태(Field) + 여러 메서드 + 상속 / 다형성 가능
class Greeter{
private final String prefix; // 상태를 가질 수 있음

public Greeter(String prefix){
  this. prefix = prefix;
}
public void greet(String name){ /// 메서드 여러개 가능
  System.out.println(prefix +" "+ name);
}
}

// 함수형 인터페이스: 추상 메서드가 오직 하나인 인터페이스 SAM > Single Abstract Method

@FunctionalInterface
interface StringAction{
  /// 추상 메서드가 딱 하나여야 함수형 인터페이스가 성립
  void run(String input);

  /// default / static 메서드는 몇개 있어도 상관 없음	-> 추상 메서드 수에 카운트 되지 않음
  default void info(){
    System.out.println("[Info] StringAction default method");
  }
  static void help(){
    System.out.println("[Help] This is a helper.");
  }
}


/// 컴파일 에러 유도
/*@FunctionalInterface
interface Broken{
  void a();
  void b();
}*/

public class FunctionalVsClass{
  public static void main(String[] args){

    /// 일반 클래스 사용
    Greeter greeter = new Greeter("Hello");
    greeter.greet("Kim"); /// 상태(prefix)를 내부에 유지 가능

    /// 함수형 인터페이스 구현체 1 - 익명 클래스
    StringAction printUpper1 = new StringAction(){
      @Override
      public void run(String input){
        System.out.println(input.toUpperCase());
      }
    };

    /// 함수형 인터페이스 구현체 2 - 람다

    StringAction printUpper2 = s-> System.out.println(s.toUpperCase());

    printUpper1.run("hello");
    printUpper2.run("world");
  }

}
