package org.example.Head002_OOProgramming.topic03_OOPConcept.example05;

public class InheritanceTest {
  public static void main(String[] args){
    User user = new BusinessUser("codeit1234", "강만식","codeint@net","toss",23131 );

    user.printUserInfo();
  }
}

class User{
  String userId;
  String name;

  public User(String userId, String name){
    this.userId = userId;
    this.name = name;
  }
  public void printUserInfo(){
    System.out.println("id: "+userId+" name: "+name);
  }
}

class PersonalUser extends User{
  private String email;

  public PersonalUser(String userId, String name, String email){
    super(userId, name);
    this.email = email;
  }

  @Override
  public void printUserInfo(){
    super.printUserInfo();
    System.out.println("email: "+email);
  }
}

class BusinessUser extends PersonalUser{
  private String work;
  private int eId;
  public BusinessUser(String userId, String name, String email,String work, int eId){
    super(userId, name, email);
    this.work = work;
    this.eId = eId;
  }
  @Override
  public void printUserInfo(){
    super.printUserInfo();
    System.out.println("work: "+work + "사원번호: "+eId);
  }
}