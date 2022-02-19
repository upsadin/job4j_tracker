package ru.job4j.inheritance;

public class Pacient {
    private char sex;
    private String pname;

    public Pacient(char sex, String name) {
        this.sex = sex;
        pname = name;
    }

    public char getSex() {
        return sex;
    }

    public String getPname() {
        return pname;
    }

    public String getInfo() {
        return "Пол: " + getSex() + ", ФИО: " + getPname();
    }
}
