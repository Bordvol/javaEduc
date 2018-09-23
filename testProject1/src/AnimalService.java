public class AnimalService {
    Animal[] animals;

    void feedAnimals() {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    void playWithAnimals() {
        // arrayname.for + tab
        for (Animal animal : animals) {
            animal.play();
        }
    }
}
