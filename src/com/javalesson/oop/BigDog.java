package com.javalesson.oop;

import com.javalesson.oop.Dog;

public class BigDog extends Dog {
    @Override
    public void setSize(String size) {
        super.setSize(size);
    }

    @Override
    protected void setPaws(int paws) {
        super.setPaws(paws);
    }
}
