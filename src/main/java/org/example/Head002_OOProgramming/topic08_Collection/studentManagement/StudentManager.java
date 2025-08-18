package org.example.Head002_OOProgramming.topic08_Collection.studentManagement;

import java.util.*;

public class StudentManager {
  private List<Student> students;
  private Set<String> studentName;
  private Map<String, Integer> map;

  public StudentManager() {
    students = new ArrayList<Student>();
    studentName = new HashSet<String>();
    map = new HashMap<>();
  }

  public void addStudent(Student student, int score) {
    /// 중복 이름 체크
    if(studentName.contains(student.getName())) {
      System.out.println("[Error] 이미 존재하는 학생 이름입니다.");
      return;
    }

    /// 등록
    students.add(student);
    studentName.add(student.getName());
    map.put(student.getName(), score);
    System.out.println("[Info] 새로운 학생이 등록 되었습니다: "+ student);
  }

  public void removeStudent(String name){
    //이름을 통해 학생 찾기
    Student target = null;
    for(Student student : students) {
      if(student.getName().equals(name)) {
        target = student;
        break;
      }
    }
    if(target != null) {
      students.remove(target);
      studentName.remove(name);
      map.remove(name);
      System.out.println("[Info} 학생이 삭제 되었습니다: "+name);
    }else{
      System.out.println("[Error] 해당 이름의 학생을 찾을 수 없습니다.");
    }
  }
  public void printAllStudents(){
    System.out.println("+++++학생 목록++++++");
    for(Student student : students){
      System.out.println(student);
    }
  }
  public void printScore(String name){
    Integer score = map.get(name);
    if(score != null){
      System.out.println("[Info] "+ name+"의 점수 : "+score);
    }else{
      System.out.println("[Error] 점수를 찾을 수 없습니다.");
    }
  }
}
