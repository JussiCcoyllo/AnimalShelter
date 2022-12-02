package be.intecbrussel;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Animal implements Vaccinateable, Treatable {

    private Map<Disease, Boolean> isVaccinated = new HashMap<>();
    private boolean isClean;
    private int age;
    private String name;
    private int animalNumber;

    public Animal() {
    }
    public Animal(boolean isClean, int age, String name, int animalNumber) {
        //add
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
    }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }
   public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    @Override
    public void treatAnimal() {
        isClean=true;
    }

    @Override
    public void vaccinateAnimal(Disease disease) {
        isVaccinated.replace(disease,true);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return isClean == animal.isClean && age == animal.age && animalNumber == animal.animalNumber && Objects.equals(isVaccinated, animal.isVaccinated) && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isVaccinated, isClean, age, name, animalNumber);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "isVaccinated=" + isVaccinated +
                ", isClean=" + isClean +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", animalNumber=" + animalNumber +
                '}';
    }
}
