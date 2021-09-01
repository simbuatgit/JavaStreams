package com.simbu.java.streams;

import java.util.stream.IntStream;

/**
 * The Class Example2 - skip with for Each example
 */
public class Example2 {

  /**
   * The main method.
   *
   * @param arg the arguments
   */
  public static void main(String[] arg) {
    IntStream.range(1, 10).skip(3).forEach(System.out::println);
  }

}
