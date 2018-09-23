public class Animal {
    long id;
    String name;
    int age;

    void play() {
        System.out.println(name + " playing");
        age++;
    }

    void eat() {
        System.out.println(name + " eating");
    }
}
