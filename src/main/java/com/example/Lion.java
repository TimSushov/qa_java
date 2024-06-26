package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private int Kittens;
    private List<String> Food;

    public Lion(String sex, int getKittens, List<String> getFood) throws Exception {
        this.Kittens=Kittens;
        this.Food = Food;

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return Kittens;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood () throws Exception {
        return Food;
    }
}
