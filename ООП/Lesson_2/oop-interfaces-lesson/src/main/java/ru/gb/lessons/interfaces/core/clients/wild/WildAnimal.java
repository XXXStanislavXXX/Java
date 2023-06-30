package ru.gb.lessons.interfaces.core.clients.wild;

import ru.gb.lessons.interfaces.core.clients.Animal;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 Абстракция дикого животного
 */
public class WildAnimal extends Animal {
    public WildAnimal() {
    }

    public WildAnimal(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        this.id = id;
        this.name = null;
        this.numberOfLimbs = numberOfLimbs;
        this.registrationDate = registrationDate;
        this.owner = owner;
        this.records = new ArrayList<>();
    }

}
