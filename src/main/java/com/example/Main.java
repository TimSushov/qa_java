package com.example;

import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", "Хищник", feline);
        lion.getKittens();
        lion.getKittens(8);
        lion.doesHaveMane();
        lion.getFood();
    }
}
