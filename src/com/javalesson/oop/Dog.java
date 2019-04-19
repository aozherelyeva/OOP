package com.javalesson.oop;

public class Dog {

    private static int dogsCount;

    private int paws;
    private int tail;
    private String name;
    private String breed;
    private String size = null;

    public Dog() {
        dogsCount++;
        System.out.println("Dog's count = " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        } else {
            this.paws = 4;
            System.out.println("User tried t assign " + paws + " paws for a dog");
            System.out.println("Correct number is 4");
        }
    }

    public int getPaws() {
        return paws;
    }

    public void setTail(int tail) {
        if (tail == 1) {
            this.tail = tail;
        } else {
            this.tail = 1;
            System.out.println("User tried t assign " + tail + " tails for a dog");
            System.out.println("Correct number is 1");
        }
    }

    public int getTail() {
        return tail;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setSize(String size) {
        if ("Big".equalsIgnoreCase(size) ||
                "Average".equalsIgnoreCase(size) ||
                "Small".equalsIgnoreCase(size)) {
            this.size = size;
        } else {
            System.out.println("Size should be one of these: Big, Average or Small");
        }
    }

    public String getSize() {
        return size;
    }

    public void bark() {
        if ("Big".equalsIgnoreCase(size)) {
            System.out.println("Wof - Wof");
        } else if ("Average".equalsIgnoreCase(size)) {
            System.out.println("Raf - Raf");
        } else if ("Small".equalsIgnoreCase(size)) {
            System.out.println("Tyaf - Tyaf");
        } else {
            System.out.println("Dog size not recognized -- can't bark");
        }
    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dogs are biting you");
        } else {
            bark();
        }
    }
}