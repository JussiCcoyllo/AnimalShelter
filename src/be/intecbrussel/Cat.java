package be.intecbrussel;

public class Cat extends Animal{

    private boolean hasLongNails;

    public Cat() {
        super();
    }

    public Cat(boolean isClean, int age, String name, int animalNumber, boolean hasLongNails) {
        super(isClean, age, name, animalNumber);
        this.hasLongNails = hasLongNails;
    }

    @Override
    public String toString() {
        return "Cat{" +
                super.toString() +
                "hasLongNails=" + hasLongNails +
                "Name:" + super.getName() +
                '}';
    }
}
