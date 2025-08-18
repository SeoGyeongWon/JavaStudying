package org.example.Head002_OOProgramming.topic05_InnerClass.example03;

@FunctionalInterface
interface MyCalculator{
  int operate(int x, int y);
}

public class LambdaDemo {
  public static void main(String[] args) {
    /// 익명  클래스 방식
    MyCalculator addAnony = new MyCalculator(){
      @Override
      public int operate(int x, int y) {
        return x +y;
      }
    } ;
    System.out.println("익명 클래스: 3 + 5 = "+ addAnony.operate(3,5));

    ///  람다식 방식
    ///  함수형 인터페이스를 쓸건데
    ///  변수를 x, y 로 두고 추상메서드에 들어갈 공식은 x+y로 할거야 라는 내용
    MyCalculator addLambda =(x,y) -> x+y;
    System.out.println("람다: 3 + 5  = "+ addLambda.operate(3,5));
  }
}
