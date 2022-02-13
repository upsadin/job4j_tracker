package ru.job4j.oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public double semiPerimeter(double ab, double ac, double bc) {
        double p = (ab + ac + bc) / 2;
        return p;
    }

    public boolean exist(double ab, double ac, double bc) {
        return (ab + bc) > ac && (ac + bc) > ab && (ab + ac) > bc;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = semiPerimeter(ab, ac, bc);
        if (exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

}
