package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public double devide(int b) {
        return (double) b / x;
    }

    public double sumAllOperation(int c) {
        return sum(c) + multiply(c) + minus(c) + devide(c);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rslsum = Calculator.sum(7);
        int rslmulti = calculator.multiply(7);
        int rslmin = Calculator.minus(7);
        double rsld = calculator.devide(7);
        double rslall = calculator.sumAllOperation(7);
        System.out.println("сумма " + rsld);
        System.out.println("произведение " + rslmulti);
        System.out.println("разница " + rslmin);
        System.out.println("деление " + rsld);
        System.out.println("сумма всех операций " + rslall);
    }
}
