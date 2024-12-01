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

        Vehicle v1 = new Vehicle(2024, "Honda", "Trail 125");
        Vehicle v2 = new Vehicle(2014, "Ford", "Expedition EL");
        Vehicle v3 = new Vehicle(2013, "Land Rover", "HSE Full Size Range Rover");
        Vehicle v4 = new Vehicle(2008, "Nissan", "Xterra");

        List<Vehicle> cars = new ArrayList<>();
        cars.add(v1);
        cars.add(v2);
        cars.add(v3);
        cars.add(v4);

        System.out.println(cars);

        List<Vehicle> report =
                cars.stream()
                                .sorted()
                                        .collect(Collectors.toList());

        System.out.println(report);
    }
}
