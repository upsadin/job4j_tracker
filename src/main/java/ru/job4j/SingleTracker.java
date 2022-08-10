package ru.job4j;

public class SingleTracker {
    private static SingleTracker instance;

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }
}
