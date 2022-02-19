package ru.job4j.inheritance;

public class Engineer extends Profession {
    private boolean certificate;

    public Engineer(String name, String surname, String education, String birthday, boolean certificate) {
        super(name, surname, education, birthday);
        this.certificate = certificate;
    }
}
