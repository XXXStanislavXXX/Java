package ru.gb.lessons.interfaces.core.clients.wild.impl;

import java.time.LocalDate;

import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

public class Duck extends WildAnimal implements Flyable, Runnable {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "Летит со скоростью: 150км/ч ");
        return 150;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "Ходит со скоростью: 5км/ч ");
        return 5;
        
    }
}
