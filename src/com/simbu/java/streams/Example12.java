package com.simbu.java.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Class Example12 - File stream,map,filter example
 */
public class Example12 {

  /**
   * The main method.
   *
   * @param arg the arguments
   * @throws IOException Signals that an I/O exception has occurred.
   */
  public static void main(String[] arg) throws IOException {
    Stream<String> lines = Files.lines(Paths.get("D:/MarkList"));

    Map<String, String> map = lines.map(x -> x.split(",")).filter(x -> x.length > 2)
        .filter(x -> Integer.parseInt(x[2]) > 90).collect(Collectors.toMap(x -> x[1], x -> x[2]));
    lines.close();
    for (Entry<String, String> entrySet : map.entrySet()) {
      System.out.println(entrySet.getKey() + " " + entrySet.getValue());
    }

  }

}
