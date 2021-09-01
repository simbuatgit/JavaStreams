package com.simbu.java.streams;

import java.util.stream.IntStream;

/**
 * The Class Example3 - sum example
 */
public class Example3 {

  /**
   * The main method.
   *
   * @param arg the arguments
   */
  public static void main(String[] arg) {
    int sum = IntStream.range(1, 10).sum();
    System.out.println(sum);
  }

}
