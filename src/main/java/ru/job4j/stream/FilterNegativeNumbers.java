package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, -1, 5, 14, 0, -7, 5);
        List<Integer> positive = numbers.stream().filter(i -> i > 0).collect(Collectors.toList());
       // positive.remove(1);
        positive.forEach(System.out::println);
    }
}