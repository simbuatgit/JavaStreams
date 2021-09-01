package com.simbu.java.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * The Class Example8 - Files Stream,filter,forEach example
 */
public class Example8 {

  /**
   * The main method.
   *
   * @param arg the arguments
   * @throws IOException Signals that an I/O exception has occurred.
   */
  public static void main(String[] arg) throws IOException {
    Stream<String> lines = Files.lines(Paths.get("D:/Subject"));

    lines.filter(x -> x.length() > 5).filter(x -> x.contains("s")).forEach(System.out::println);
  }

}
