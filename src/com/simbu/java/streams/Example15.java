package com.simbu.java.streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 * The Class Example15 - Consumer example
 */
public class Example15 {

  /**
   * The main method.
   *
   * @param arg the arguments
   */
  public static void main(String[] arg) {
    Consumer<List<Integer>> upperCaseConsumer = list -> IntStream.range(1, 10).forEach(System.out::println);
    System.out.println(upperCaseConsumer);
  }

}
