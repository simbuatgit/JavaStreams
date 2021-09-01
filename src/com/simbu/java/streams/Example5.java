package com.simbu.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Class Example5 - filter example
 */
public class Example5 {

  /**
   * The main method.
   *
   * @param arg the arguments
   */
  public static void main(String[] arg) {

    String[] arrays = {"name", "prame1", "gamma", "lamda"};
    List<String> collect = Arrays.stream(arrays).filter(x -> x.length() > 5).collect(Collectors.toList());
    System.out.println(collect);

    Stream.of("kayal", "pothumponnu", "sala", "amutha").filter(x -> x.startsWith("p")).sorted()
        .forEach(System.out::println);
  }

}
