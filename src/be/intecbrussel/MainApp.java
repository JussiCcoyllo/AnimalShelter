package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {

        Monkey monkey1 = new Monkey(true, 2,"Moni",1, true);
        Monkey monkey2 = new Monkey(true, 4,"Mono",2, false);
        Dog dog1 = new Dog(true, 4,"Mono",2, false);
        Dog dog2 = new Dog(true, 3,"Michi",7, true);
        Cat cat1 = new Cat(false, 3,"Jack",4, true);
        Cat cat2 = new Cat(true, 6,"Chef",5, false);

        AnimalShelter shelter = new AnimalShelter();
        shelter.addAnimal(monkey1);
        shelter.addAnimal(monkey2);
        shelter.addAnimal(cat1);
        shelter.addAnimal(cat2);
        shelter.addAnimal(dog1);
        shelter.addAnimal(dog2);

        System.out.println("===Age===");
        shelter.sortAnimalsByAge();

        System.out.println("===Name===");
        shelter.sortAnimalsByName();

        shelter.countAnimals();

        shelter.printAnimals();

        cat1.vaccinateAnimal(Disease.POLIO);
        System.out.println(cat1.getIsVaccinated());
        dog1.vaccinateAnimal(Disease.POLIO);

        Animal oldest = shelter.findOldestAnimal();
        System.out.println(oldest);

    }
}

