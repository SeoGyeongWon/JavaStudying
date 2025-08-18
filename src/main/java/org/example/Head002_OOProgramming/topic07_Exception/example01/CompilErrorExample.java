package org.example.Head002_OOProgramming.topic07_Exception.example01;

import java.io.FileReader;
import java.io.IOException;

/// checkedException
public class CompilErrorExample {
  ///  throws IOEXception을 하거나 try- catch 필요
  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("test.txt");
  }
}
