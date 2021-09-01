package com.simbu.java.streams;

import java.util.Arrays;

/**
 * The Class Example7 - map,forEach example
 */
public class Example7 {

  /**
   * The main method.
   *
   * @param arg the arguments
   */
  public static void main(String[] arg) {

    Arrays.stream(new String[] {"simbu", "siva", "final", "uma", "lalitha", "kumari"}).map(String::toUpperCase)
        .forEach(System.out::println);
  }

}
