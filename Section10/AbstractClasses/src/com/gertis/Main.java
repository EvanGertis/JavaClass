package com.gertis;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Charlie");

        parrot.eat();
        parrot.fly();
    }
}
