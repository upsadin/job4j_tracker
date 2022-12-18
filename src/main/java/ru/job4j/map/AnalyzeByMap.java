package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        int scoreSum = 0;
        int sum = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                scoreSum += subject.score();
                sum++;
            }
        }
        return (double) scoreSum / sum;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();
        int scoreSum = 0;
        int sum = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                scoreSum += subject.score();
                sum++;
            }
            rsl.add(new Label(pupil.name(), scoreSum / sum));
            scoreSum = 0;
            sum = 0;
        }
        return rsl;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> temp = new LinkedHashMap<>();
        int scoreSum = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                temp.put(subject.name(), temp.getOrDefault(subject.name(), 0)
                + subject.score());
            }
        }
        List<Label> rsl = new ArrayList<>();
        for (String subjName : temp.keySet()) {
            rsl.add(new Label(subjName, temp.get(subjName) / pupils.size()));
        }
        return rsl;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();
        int scoreSum = 0;
        int sum = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                scoreSum += subject.score();
                sum++;
            }
            rsl.add(new Label(pupil.name(), scoreSum));
            scoreSum = 0;
            sum = 0;
        }
        rsl.sort(Comparator.naturalOrder());
        return rsl.get(rsl.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> temp = new LinkedHashMap<>();
        int scoreSum = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                temp.put(subject.name(), temp.getOrDefault(subject.name(), 0)
                        + subject.score());
            }
        }
        List<Label> rsl = new ArrayList<>();
        for (String subjName : temp.keySet()) {
            rsl.add(new Label(subjName, temp.get(subjName)));
        }
        rsl.sort(Comparator.naturalOrder());
        return rsl.get((rsl.size() - 1));
    }

}