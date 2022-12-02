package be.intecbrussel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class AnimalShelter {
    private List<Animal> animals = new ArrayList<>();
    private int animalId;

    public AnimalShelter() {
    }

    public AnimalShelter(int animalId) {
        this.animalId = animalId;
    }

    public void printAnimals(){
        System.out.println(animals);
    }

    public void sortAnimals() {
        //Animal sorted by  number
        Comparator<Animal> naturalOrder = Comparator.comparing(animals -> animals.getAnimalNumber());

    }

    public void sortAnimalsByName(){

        Comparator<Animal> sortByName = Comparator.comparing(animals->animals.getName());
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
    public void sortAnimalsByAge(){

        Comparator<Animal> sortByAge = Comparator.comparing(animals->animals.getAge());
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void printAnimalsNotVaccinated(Disease disease){

    }

    public List<Animal> getAnimals() {
        return animals;
    }

     public Animal findAnimal(int animalNumber){
         return null;

     }

    public Animal findAnimal(String name){

        return null;
    }

    public void treatAnimal(int animalNumber) {
        for (Animal animal : animals) {
            if(animal.getAnimalNumber() == animalNumber) {
                animal.treatAnimal();
            }
        }
    }
    public void treatAnimal(String name){
        for (Animal animal : animals) {
            if(animal.getName().equals(name)) {
                animal.treatAnimal();
            }
        }

    }
    public void treatAllAnimals(){
        for (Animal animal : animals) {
            animal.treatAnimal();
        }
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public Animal findOldestAnimal(){
        animals.sort(Comparator.comparingInt(Animal::getAge).reversed());
        return animals.get(0);
    }

    public int countAnimals(){
        return  animals.size();
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "animals=" + animals +
                ", animalId=" + animalId +
                '}';
    }
}
