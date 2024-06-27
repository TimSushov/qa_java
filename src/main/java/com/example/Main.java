package com.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", "Хищник", feline);
        System.out.println(lion.getKittens());
        System.out.println(lion.getKittens(8));
        System.out.println(lion.doesHaveMane());
        System.out.println(lion.getFood());
    }
}
