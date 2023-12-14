public class Main {
    public static void main(String[] args) {
        // Создание приюта для использования в конструкторах
        Shelter myShelter = new Shelter("Example Shelter", "123 Main Street");

        // Создание собак с использованием разных конструкторов
        Dog dog1 = new Dog(); // Конструктор по умолчанию
        Dog dog2 = new Dog("Buddy", "Golden Retriever", "Golden", myShelter); // Конструктор с параметрами name, breed, color, shelter
        Dog dog3 = new Dog("Charlie", "Beagle", "Tricolor", myShelter, new String[]{"Sit", "Speak"}); // Конструктор с параметрами name, breed, color, shelter, commands

        // Вывод информации о собаках
        System.out.println("Information about Dog 1:\n" + dog1.getInfo() + "\n");
        System.out.println("Information about Dog 2:\n" + dog2.getInfo() + "\n");
        System.out.println("Information about Dog 3:\n" + dog3.getInfo() + "\n");

        // Вызов методов makeVoice
        System.out.println("Dog 1 barking:");
        dog1.makeVoice("Gaaf");
        System.out.println();

        System.out.println("Dog 2 barking:");
        dog2.makeVoice("Woof!"); 
        System.out.println();

        System.out.println("Dog 3 barking three times:");
        dog3.makeVoice("AAUUU!", 3); 
    }
}
