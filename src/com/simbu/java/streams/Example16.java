package com.simbu.java.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The Class Example16 - flatmap xxample
 */
public class Example16 {

  /**
   * Gets the flat list.
   *
   * @param namesNested the names nested
   * @return the flat list
   */
  public List<String> getFlatList(List<List<String>> namesNested) {

    return namesNested.stream().flatMap(Collection::stream).collect(Collectors.toList());
  }

  /**
   * The main method.
   *
   * @param arg the arguments
   */
  public static void main(String arg[]) {

    List<List<String>> namesNested = Arrays.asList(Arrays.asList("A1", "B1"), Arrays.asList("A2", "B2"),
        Arrays.asList("A3", "B3"));
    System.out.println(new Example16().getFlatList(namesNested));
  }
}
