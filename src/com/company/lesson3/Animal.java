package com.company.lesson3;

public class Animal {
    public Animal(String name) {
        this.name = name;
    }

    private static String breed = "Empty";
    public String name;

    public void makeSound() {
        System.out.println("o");
    }

    public static String getBreed() {
        return breed;
    }


}
