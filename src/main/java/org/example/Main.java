package org.example;

public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();
        Person one = builder.name("Markus")
                .surname("Stark")
                .age(35)
                .city("Chicago")
                .build();
        one.setAddress("Bayer");
        System.out.println(one);
        Person two = one.newChildBuilder()
                .name("Alvaro")
                .age(31)
                .build();
        two.happyBirthday();
        System.out.println(two);
    }
}