package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted((left, right) -> Integer.compare(right.getScore(), left.getScore()))
                .takeWhile(s -> s.getScore() > bound).toList();
    }
}
