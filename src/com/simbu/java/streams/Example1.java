package com.simbu.java.streams;

import java.util.stream.IntStream;

/**
 * The Class Example1 - for Each example
 */
public class Example1 {

  /**
   * The main method.
   *
   * @param arg the arguments
   */
  public static void main(String[] arg) {
    IntStream.range(1, 10).forEach(System.out::println);
  }

}
