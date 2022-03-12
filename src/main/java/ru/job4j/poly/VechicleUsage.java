package ru.job4j.poly;

public class VechicleUsage {
    public static void main(String[] args) {
    Vehicle plain = new Plain();
    Vehicle plain2 = new Plain();
    Vehicle train = new Train();
    Vehicle train2 = new Train();
    Vehicle bus = new Bus();
    Vehicle bus2 = new Bus();

    Vehicle[] vehicles = new Vehicle[]{plain, plain2, train, train2, bus, bus2};
        for (Vehicle v : vehicles) {
        v.move();
        }
    }
}
