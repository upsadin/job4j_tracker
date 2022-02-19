package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String lang;

    public Programmer(String name, String surname, String education, String birthday, boolean certificate, String lang) {
        super(name, surname, education, birthday, certificate);
        this.lang = lang;
    }

    public void code() {
        System.out.println("Вот такой вот код");
    }
}
