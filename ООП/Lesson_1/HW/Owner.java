package ООП.Lesson_1.HW;

public class Owner {
    private String name;
    public Owner(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}