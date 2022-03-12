package ru.job4j.poly;

public class Bus implements Transport, Vehicle {

    @Override
    public void drive() {
    }

    @Override
    public void passangers(int count) {
    }

    @Override
    public double tank(double quant) {
        return 0;
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " ездит по дорогам");
    }

    @Override
    public void capacity(int amount) {
        System.out.println(getClass().getSimpleName() + " вмещает пассажиров" + amount);
    }
}
