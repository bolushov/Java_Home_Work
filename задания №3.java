public class Pet {
    private int age;
    private String color;
    private Shelter shelter;

    // Конструктор для инициализации полей класса
    public Pet(String color, Shelter shelter) {
        this.color = color;
        this.shelter = shelter;
        this.age = generateDefaultAge();
    }

    // Геттер для поля age
    public int getAge() {
        return age;
    }

    // Сеттер для поля age
    public void setAge(int age) {
        this.age = age;
    }

    // Геттер для поля color
    public String getColor() {
        return color;
    }

    // Сеттер для поля color
    public void setColor(String color) {
        this.color = color;
    }

    // Геттер для поля shelter
    public Shelter getShelter() {
        return shelter;
    }

    // Сеттер для поля shelter
    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    // Метод для генерации значения по умолчанию для поля age
    private int generateDefaultAge() {
        // Здесь может быть логика для генерации значения по умолчанию
        return 1; // Например, по умолчанию устанавливаем возраст 1 год
    }

    // Метод для получения всей информации о питомце
    public String getInfo() {
        return "Pet Information:\n" +
               "Age: " + age + " years\n" +
               "Color: " + color + "\n" +
               "Shelter: " + shelter.getName() + " at " + shelter.getAddress();
    }

    public static void main(String[] args) {
        // Пример использования класса Pet
        Shelter myShelter = new Shelter("Example Shelter", "123 Main Street");
        Pet myPet = new Pet("Brown", myShelter);

        // Получение и вывод информации через метод getInfo()
        System.out.println(myPet.getInfo());
    }
}
