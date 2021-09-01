package com.simbu.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The Class Example17 - Use case - get numbers starts with 1 from array using
 * filter
 */
public class Example17 {

  /**
   * The main method.
   *
   * @param arg the arguments
   */
  public static void main(String[] arg) {
    List<Integer> myList = Arrays.asList(10, 15, 8, 49, 125, 98, 32);
    List<Integer> collect = myList.stream().filter(x -> String.valueOf(x).substring(0, 1).equals("1"))
        .collect(Collectors.toList());
    System.out.println(collect);
  }
}
