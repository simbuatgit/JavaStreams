package com.simbu.java.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * The Class Example11 - File Stream,reduce example
 */
public class Example11 {

  /**
   * The main method.
   *
   * @param arg the arguments
   * @throws IOException Signals that an I/O exception has occurred.
   */
  public static void main(String[] arg) throws IOException {
    Stream<String> lines = Files.lines(Paths.get("D:/MarkList"));

    String reduce = lines.reduce("", (String a, String b) -> a + b + "\n");
    System.out.println(reduce);
    lines.close();

  }

}
