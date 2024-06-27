package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private Feline feline;
    private String food;

    public Lion(String sex, String food, Feline feline) throws Exception {
        this.feline =feline;
        this.food=food;

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() throws Exception {
        return feline.getKittens();
    }

    public int getKittens(int kittensCount) throws Exception {
        return feline.getKittens(kittensCount);
    }

    public boolean doesHaveMane() throws Exception {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood(food);
    }
}
