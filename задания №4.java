public class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    // Конструктор по умолчанию
    public Dog() {
        super("Brown", new Shelter("Default Shelter", "Default Address"));
        this.name = "Default Dog";
        this.breed = "Unknown Breed";
        this.commands = new String[]{"Sit", "Stay"};
    }

    // Конструктор с параметрами name, breed, color, shelter
    public Dog(String name, String breed, String color, Shelter shelter) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = new String[]{"Sit", "Stay"};
    }

    // Конструктор с параметрами name, breed, color, shelter, commands
    public Dog(String name, String breed, String color, Shelter shelter, String[] commands) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    // Геттер для поля name
    public String getName() {
        return name;
    }

    // Сеттер для поля name
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для поля breed
    public String getBreed() {
        return breed;
    }

    // Сеттер для поля breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Геттер для поля commands
    public String[] getCommands() {
        return commands;
    }

    // Сеттер для поля commands
    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    // Перегруженные методы makeVoice
    public void makeVoice() {
        System.out.println("Woof!");
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    // Перезаписанный метод getInfo
    @Override
    public String getInfo() {
        return "Dog Information:\n" +
               "Name: " + name + "\n" +
               "Breed: " + breed + "\n" +
               "Color: " + getColor() + "\n" +
               "Shelter: " + getShelter().getName() + " at " + getShelter().getAddress() + "\n" +
               "Commands: " + arrayToString(commands);
    }

    private String arrayToString(String[] array) {
        StringBuilder result = new StringBuilder();
        for (String item : array) {
            result.append(item).append(", ");
        }
        // Удаляем последнюю запятую и пробел
        if (result.length() > 2) {
            result.setLength(result.length() - 2);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        //использования класса Dog
        Shelter myShelter = new Shelter("Example Shelter", "123 Main Street");
        Dog myDog = new Dog("Buddy", "Labrador Retriever", "Golden", myShelter, new String[]{"Sit", "Stay", "Roll Over"});

        //  вывод  через метод getInfo()
        System.out.println(myDog.getInfo());

        // Пример использования перегруженных методов makeVoice
        myDog.makeVoice(); // Выводит "Woof!"
        myDog.makeVoice("Bark!"); // Выводит "Bark!"
        myDog.makeVoice("Woof!", 3); // Выводит "Woof!" три раза
    }
}
