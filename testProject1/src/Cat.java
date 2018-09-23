public class Cat extends Animal{
    boolean isMyayOn;

    Cat() {
    }

    Cat(Cat cat) {
        this(cat.id, cat.name, cat.age);
    }

    Cat(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void eat() {
        super.eat();
        age--;
        super.eat();
        System.out.println(name + " is younger!");
        // number.fori + tab
        for (int i = 0; i < 10; i++) {
            super.eat();
        }

    }

    void printInfo() {
        System.out.print("Cat, id = " + id);
        System.out.print(", name = " + name);
        System.out.println(", age = " + age);
    }

    Cat makeCat(Cat fatherCat) {
        Cat newCat = new Cat();

        newCat.id = id + fatherCat.id;
        newCat.age = 0;
        String motherName = name;
        String fatherName = fatherCat.name;

        String namePrefix = motherName.substring(0, motherName.length() / 2);
        String nameSuffix = fatherName.substring(fatherName.length() / 2);

        newCat.name = namePrefix + nameSuffix;

        return newCat;
    }

}
