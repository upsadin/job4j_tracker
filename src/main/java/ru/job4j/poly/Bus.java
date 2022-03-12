package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public boolean drive() {
        return false;
    }

    @Override
    public int passangers(int count) {
        return 0;
    }

    @Override
    public double tank(double quant) {
        return 0;
    }
}
