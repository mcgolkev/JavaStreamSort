package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        solution();
        solution2();
    }

    private static void solution() {
        String words = "The quick brown fox jumps over the lazy dog";

        String word = words.replaceAll(" ", "").toLowerCase(Locale.ROOT);

        String sortedString =
                Stream.of(word.split(""))
                        .sorted()
                        .distinct()
                        .collect(Collectors.joining());

        System.out.println(sortedString);
    }

    private static void solution2() {
        String words = "The quick brown fox jumps over the lazy dog";

        String word = words.replaceAll(" ", "").toLowerCase(Locale.ROOT);

        String sortedString =
                Stream.of(word.split(""))
                        .sorted(Collections.reverseOrder())
                        .distinct()
                        .collect(Collectors.joining());

        System.out.println(sortedString);
    }
}
