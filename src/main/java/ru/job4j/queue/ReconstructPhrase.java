package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;
    private final Deque<Character> evenElement;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElement) {
        this.descendingElements = descendingElements;
        this.evenElement = evenElement;
    }

    private String getEvenElements() {
        StringBuilder sb = new StringBuilder();
        Character temp = null;
        int size = evenElement.size();
        for (int i = 0; i < size; i++) {
            temp = evenElement.poll();
            if (i % 2 == 0) {
                sb.append(temp);
            }
        }
        return sb.toString();
    }

    private String getDescendingElements() {
        StringBuilder sb = new StringBuilder();
        Iterator<Character> iterator = descendingElements.descendingIterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
        }
        return sb.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
