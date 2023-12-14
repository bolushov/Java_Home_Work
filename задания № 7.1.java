// 1-й уровень иерархии
public class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

// 2-й уровень иерархии
public class Mammal extends Animal {
    private String name;

    public Mammal(int age, String name) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Перегруженный метод, который нельзя перезаписать
    public final void eat() {
        System.out.println(name + " is eating.");
    }
}

// 3-й уровень иерархии (несколько дополнительных полей и перезаписанный метод)
public final class Dog extends Mammal {
    private Toy favoriteToy;
    private Breed breed;

    public Dog(int age, String name, Toy favoriteToy, Breed breed) {
        super(age, name);
        this.favoriteToy = favoriteToy;
        this.breed = breed;
    }

    public Toy getFavoriteToy() {
        return favoriteToy;
    }

    public Breed getBreed() {
        return breed;
    }

    // Перезаписанный метод
    @Override
    public void eat() {
        System.out.println(getName() + " the dog is enjoying a meal.");
    }
}

// Пример класса, используемого в составном типе (сложного типа)
public class Toy {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Пример перечисления для поля с enum
public enum Breed {
    LABRADOR, BEAGLE, GERMAN_SHEPHERD
}
