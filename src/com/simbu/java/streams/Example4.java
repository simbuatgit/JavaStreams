package com.simbu.java.streams;

import java.util.stream.Stream;

/**
 * The Class Example4 - sorted,findFirst,ifPresent example
 */
public class Example4 {

  /**
   * The main method.
   *
   * @param arg the arguments
   */
  public static void main(String[] arg) {
    Stream.of("kayal", "pothumponnu", "sala", "amutha").sorted().findFirst().ifPresent(System.out::println);
  }

}
