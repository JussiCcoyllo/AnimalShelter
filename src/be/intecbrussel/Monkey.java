package be.intecbrussel;

public class Monkey extends Animal {

    private boolean isHyperactive;

    public Monkey() {

    }

    public Monkey(boolean isClean, int age, String name, int animalNumber, boolean isHyperactive) {
        super(isClean, age, name, animalNumber);
        this.isHyperactive = isHyperactive;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                super.toString() +
                "isHyperactive=" + isHyperactive +
                '}';
    }
}