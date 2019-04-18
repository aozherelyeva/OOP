package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {
        Dog lab = new Dog();
        lab.setPaws(4);
        lab.setTail(1);
        lab.setName("Charley");
        lab.setBreed("Labrador");

        Dog sheppard = new Dog();
        sheppard.setPaws(5);
        sheppard.setTail(2);
        sheppard.setName("Mike");
        sheppard.setBreed("Sheppard");

        System.out.println("Lab's name is "+lab.getName());
        System.out.println("Sheppard's name is "+sheppard.getName());
        System.out.println("Lab has "+lab.getPaws()+" paws");
        System.out.println("Sheppard has "+lab.getTail()+" tail");

    }
}
