package com.simbu.java.streams;

import java.util.Arrays;

/**
 * The Class Example6 - map, average, ifPresent example
 */
public class Example6 {

  /**
   * The main method.
   *
   * @param arg the arguments
   */
  public static void main(String[] arg) {

    Arrays.stream(new int[] {1, 2, 3, 4, 5, 6}).map(x -> x * x).average().ifPresent(System.out::println);
  }

}
