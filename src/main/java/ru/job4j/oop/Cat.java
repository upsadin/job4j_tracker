package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("Котик " + name + " ел " + food);
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        Cat black = new Cat();
        gav.giveNick("Гав");
        gav.eat("Котлета");
        black.giveNick("Черный кот");
        black.eat("Рыба");
        gav.show();
        black.show();
    }
}
