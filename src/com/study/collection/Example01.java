package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

@SuppressWarnings("Duplicates")
public class Example01 {

  static void addData(Collection<String> c) {
    c.add("one");
    c.add("two");
    c.add("three");
  }

  static void printCollection(Collection<String> c) {
    for (String s : c) System.out.printf("%s ", s);
    System.out.println();
  }

  public static void main(String[] args) {

    Collection<String> c1 = new LinkedList<>();
    Collection<String> c2 = new ArrayList<>();

    addData(c1);
    addData(c2);
    printCollection(c1);
    printCollection(c2);

  }

}
