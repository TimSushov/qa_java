package com.example;

import java.util.Collections;
import java.util.List;

public interface DependenciesFeline {
     default int getKittens() {
        return 0;
    }

     default int getKittens(int kittensCount) {
        return 0;
    }

    public default List<String> getFood() throws Exception {
        return Collections.singletonList("Животное");
    }
}
//Класс Lion не должен зависеть от класса Feline. Используй принцип инъекции зависимостей.