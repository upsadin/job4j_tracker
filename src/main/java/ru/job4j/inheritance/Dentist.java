package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean newBormashina;

    public Dentist(String name, String surname, String education, String birthday, int experience,boolean newBormashina) {
        super(name, surname, education, birthday, experience);
        this.newBormashina = newBormashina;
    }
}
