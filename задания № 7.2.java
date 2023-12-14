public class Main {
    public static void main(String[] args) {
        Toy dogToy = new Toy("Squeaky Bone");

        // Создаем объект класса 2-го уровня
        Mammal objectA = new Mammal(3, "Max");

        // Создаем 2 объекта класса 3-го уровня
        Dog objectB = new Dog(2, "Buddy", dogToy, Breed.LABRADOR);
        Dog objectC = new Dog(4, "Charlie", dogToy, Breed.BEAGLE);

        // Выводим информацию и вызываем методы через каждый из экземпляров
        System.out.println("Object A Info: Age - " + objectA.getAge() + ", Name - " + objectA.getName());
        objectA.eat();
        System.out.println();

        System.out.println("Object B Info: Age - " + objectB.getAge() + ", Name - " + objectB.getName() +
                ", Favorite Toy - " + objectB.getFavoriteToy().getName() + ", Breed - " + objectB.getBreed());
        objectB.eat();
        System.out.println();

        System.out.println("Object C Info: Age - " + objectC.getAge() + ", Name - " + objectC.getName() +
                ", Favorite Toy - " + objectC.getFavoriteToy().getName() + ", Breed - " + objectC.getBreed());
        objectC.eat();
    }
}
