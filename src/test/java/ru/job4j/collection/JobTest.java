package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import ru.job4j.search.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class JobTest {
    @Test
    public void whenComparatorIncByPriority() {
        Job j1 = new Job("taskA", 1);
        Job j2 = new Job("taskB", 2);
        Comparator<Job> cmp = new JobIncByPriority();
        assertThat(cmp.compare(j1, j2)).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByPriority() {
        Job j1 = new Job("taskA", 1);
        Job j2 = new Job("taskB", 2);
        Comparator<Job> cmp = new JobDescByPriority();
        assertThat(cmp.compare(j1, j2)).isGreaterThan(0);
    }

    @Test
    public void whenComparatorIncByName() {
        Job j1 = new Job("taskA", 1);
        Job j2 = new Job("taskB", 2);
        Comparator<Job> cmp = new JobIncByName();
        assertThat(cmp.compare(j1, j2)).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByName() {
        Job j1 = new Job("taskA", 1);
        Job j2 = new Job("taskB", 2);
        Comparator<Job> cmp = new JobDescByName();
        assertThat(cmp.compare(j1, j2)).isGreaterThan(0);
    }

    @Test
    public void whenCombComparatorDesc() {
        Job j1 = new Job("taskA", 1);
        Job j2 = new Job("taskB", 2);
        Comparator<Job> cmp = new JobDescByName().thenComparing(new JobDescByPriority());
        assertThat(cmp.compare(j1, j2)).isGreaterThan(0);
    }

    @Test
    public void whenCombComparatorInc() {
        Job j1 = new Job("taskA", 1);
        Job j2 = new Job("taskA", 2);
        Comparator<Job> cmp = new JobIncByName().thenComparing(new JobIncByPriority());
        assertThat(cmp.compare(j1, j2)).isLessThan(0);
    }

}