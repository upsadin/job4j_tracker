package ru.job4j.poly;

public class Bus implements Transport, Vehicle {

    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passangers(int count) {
        System.out.println("КОличество пассажиров в автобусе: " + count);
    }

    @Override
    public double tank(double quant) {
        return quant * 50.25;
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
