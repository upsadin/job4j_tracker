package ru.job4j.poly;

public class Plain implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летит по небу");
    }

    @Override
    public void capacity(int amount) {
        System.out.println(getClass().getSimpleName() + " вмещает пассажиров" + amount);
    }
}
