public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat(1, "Murzik", 10);
        Dog dog = new Dog(2, "Toliik", 15, 0);

        print(cat);

        Animal[] animals = new Animal[3];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = new Cow("Zor'ka");

        AnimalService animalService = new AnimalService();
        animalService.animals = animals;

        animalService.playWithAnimals();
        animalService.feedAnimals();
    }

    static void print(Animal animal) {
        String str = "Animal, id = " + animal.id + ", "
                + animal.name + ", " + animal.age;
        System.out.println(str);

    }


}
