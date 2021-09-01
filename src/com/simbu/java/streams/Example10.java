package com.simbu.java.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * The Class Example10 - File Stream, map, filter,for Each example
 */
public class Example10 {

  /**
   * The main method.
   *
   * @param arg the arguments
   * @throws IOException Signals that an I/O exception has occurred.
   */
  public static void main(String[] arg) throws IOException {
    Stream<String> lines = Files.lines(Paths.get("D:/MarkList"));

    lines.map(x -> x.split(",")).filter(x -> x.length > 2).filter(x -> Integer.parseInt(x[2]) > 90)
        .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
    lines.close();
  }

}
