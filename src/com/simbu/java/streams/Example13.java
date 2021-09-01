package com.simbu.java.streams;

import java.io.IOException;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * The Class Example13 - summay statistics example
 */
public class Example13 {

  /**
   * The main method.
   *
   * @param arg the arguments
   * @throws IOException Signals that an I/O exception has occurred.
   */
  public static void main(String[] arg) throws IOException {
    IntSummaryStatistics summaryStatistics = IntStream.of(23, 1, 54, 98, 73, 99, 102, 87, 67).summaryStatistics();
    System.out.println(summaryStatistics);

  }

}
