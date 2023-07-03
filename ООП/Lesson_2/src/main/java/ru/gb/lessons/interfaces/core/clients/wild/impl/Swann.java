package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

public class Swann extends WildAnimal implements Flyable, Runnable, Swimable, Soundable {
    public Swann() {
    }

    @Override
    public void getIll() {

    }

    public Swann(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super();
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "летит со скоростью: 12 км/ч");
        return 12;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "ходит со скоростью: 6 км/ч");
        return 6;
    }

    @Override
    public void sound() {
        System.out.println(CLASS_NAME + "прокричал: 2 раза");
    }

    @Override
    public int getSwimingSpeed() {
        System.out.println(CLASS_NAME + "плывет со скоростью 4 узла");
        return 4;
    }
}

