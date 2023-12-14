public class Shelter {
    private String name;
    private String address;

    // Конструктор для инициализации полей класса
    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Геттер для поля name
    public String getName() {
        return name;
    }

    // Геттер для поля address
    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        // используем класс Shelter
        Shelter myShelter = new Shelter("Example Shelter", "123 Main Street");

        // Получаем данные через геттер
        System.out.println("Shelter Name: " + myShelter.getName());
        System.out.println("Shelter Address: " + myShelter.getAddress());
    }
}
