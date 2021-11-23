package by.overone;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String surname;
    private int id;
    static int count = 0;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        count++;
        id=count;
    }

    public String infoPerson() {
        return this.name + " " + this.surname;
    }

    @Override
    public String toString() {
        return "Person" + id + "{" +
                name + ' ' + surname + '}';
    }
}
