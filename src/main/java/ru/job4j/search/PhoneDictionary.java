package ru.job4j.search;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> contName = pers -> pers.getName().contains(key);
        Predicate<Person> contSurname = pers -> pers.getSurname().contains(key);
        Predicate<Person> contPhone = pers -> pers.getPhone().contains(key);
        Predicate<Person> contAdress = pers -> pers.getAddress().contains(key);
        Predicate<Person> combine = contName.or(contSurname).or(contPhone).or(contAdress);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
/*        ArrayList<Person> rsl = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(key)
            || person.getSurname().contains(key)
            || person.getPhone().contains(key)
            || person.getAddress().contains(key)) {
                rsl.add(person);
            }
        }
        return rsl;
 */   }
}
