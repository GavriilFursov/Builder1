package org.example;

import java.util.Objects;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder age(int age) {
        if (age > 0 & age < 150) {
            this.age = age;
            return this;
        } else {
            throw new IllegalArgumentException("Некорректный возраст");
        }
    }

    public PersonBuilder city(String city) {
        this.city = city;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PersonBuilder is = (PersonBuilder) obj;
        return age == is.age && Objects.equals(name, is.name) && Objects.equals(surname, is.surname) && Objects.equals(city, is.city);
    }

    public Person build() {
        if (name != null && surname != null && age != 0 && city != null) {
            return new Person(name, surname, age, city);
        } else {
            throw new IllegalStateException("Не все поля заполнены");
        }
    }

    @Override
    public String toString() {
        return "PersonBuilder{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
