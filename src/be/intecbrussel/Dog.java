package be.intecbrussel;

public class Dog extends Animal {
    private boolean hasFoulBreath;

    public Dog() {
        super();
    }

    public Dog(boolean isClean, int age, String name, int animalNumber, boolean hasFoulBreath) {
        super(isClean, age, name, animalNumber);
        this.hasFoulBreath = hasFoulBreath;
    }

    @Override
    public String toString() {
        return "Dog{" +
                super.toString() +
                "hasFoulBreath=" + hasFoulBreath +
                '}';
    }
}

