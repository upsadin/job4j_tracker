package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(p -> p.subjects().stream())
                .mapToInt(Subject::score)
                .average().orElse(0D);
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .map(p -> new Tuple(
                        p.name(),
                        p.subjects().stream()
                                            .mapToInt(Subject::score)
                                            .average().orElse(0D)
                )).toList();
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .flatMap(p -> p.subjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::name,
                        Collectors.averagingDouble(Subject::score)
                )).entrySet().stream()
                .map(m -> new Tuple(m.getKey(), m.getValue())).toList();
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(p -> new Tuple(
                        p.name(),
                        p.subjects().stream()
                                .mapToInt(Subject::score)
                                .sum()
                ))
                .max(Comparator.comparing(Tuple::score))
                .orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(p -> p.subjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::name,
                        Collectors.summingInt(Subject::score)
                )).entrySet().stream()
                .map(m -> new Tuple(
                        m.getKey(),
                        m.getValue()
                ))
                .max(Comparator.comparing(Tuple::score))
                .orElse(null);
    }
}