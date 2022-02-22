package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFio("Pavlov Pavel Pavlovich");
        student1.setGroup(15);
        student1.setEnterDate("01 September 1990");
        System.out.println("Student " + student1.getFio() + " entered on " + student1.getEnterDate()
                + " in the group №" + student1.getGroup());
    }
}
