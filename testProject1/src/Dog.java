public class Dog extends Animal {
    int killedEnemies;

    public Dog(long id, String name, int age, int killedEnemies) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.killedEnemies = killedEnemies;
    }

    void eat() {
        System.out.println(name + " eating");
        killedEnemies++;
    }
}
