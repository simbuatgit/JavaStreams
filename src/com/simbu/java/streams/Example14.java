package com.simbu.java.streams;

import java.util.stream.Stream;

/**
 * The Class Example14 - filter,findFirst,ifPresentOrElse example
 */
public class Example14 {

  /**
   * The main method.
   *
   * @param arg the arguments
   */
  public static void main(String[] arg) {
    Stream.of("kayal", "pothumponnu", "sala", "amutha").filter(x -> x.startsWith("y")).forEach(System.out::println);

    Stream.of("kayal", "pothumponnu", "sala", "amutha").filter(x -> x.startsWith("y")).findFirst()
        .ifPresentOrElse(x -> x.substring(1), () -> System.out.println("empty"));
  }

}
