package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int experience;

    public Builder() {

    }

    public Builder(String name, String surname, String education, String birthday, boolean certificate, int experience) {
        super(name, surname, education, birthday, certificate);
        this.experience = experience;
    }

    public void project() {
        System.out.println("Проект готов");
    }
}
