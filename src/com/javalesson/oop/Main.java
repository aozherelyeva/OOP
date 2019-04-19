package com.javalesson.oop;

import com.javalesson.oop.Dog;

public class Main {
    public static void main(String[] args) {

        Dog lab = new Dog();
        lab.setPaws(4);
        lab.setTail(1);
        lab.setName("Charley");
        lab.setBreed("Labrador");
        //lab.setSize("Average");
        lab.bark();
        lab.bite();

        Dog sheppard = new Dog();
        sheppard.setPaws(4);
        sheppard.setTail(1);
        sheppard.setName("Mike");
        sheppard.setBreed("Sheppard");
        //sheppard.setSize("Big");
        sheppard.bark();
        sheppard.bite();

        Dog doberman = new Dog();
        doberman.setPaws(4);
        doberman.setTail(1);
        doberman.setName("Mike");
        doberman.setBreed("Doberman");
        //doberman.setSize("big");
        doberman.bark();
        doberman.bite();

/*
        System.out.println("Lab's name is " + lab.getName());
        System.out.println("Sheppard's name is " + sheppard.getName());
        System.out.println("Lab has " + lab.getPaws() + " paws");
        System.out.println("Sheppard has " + lab.getTail() + " tail");
*/

    }
}

