package ru.job4j.poly;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по рельсам");
    }

    @Override
    public void capacity(int amount) {
        System.out.println(getClass().getSimpleName() + " вмещает пассажиров" + amount);
    }
}
