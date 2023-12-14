enum Color {
    BLACK, WHITE, GRAY, BROWN
}


public class EnumColorExample {
    public static void main(String[] args) {
        Color myColor = Color.GRAY;

        //  выбранный цвет
        System.out.println("My chosen color is: " + myColor);

        switch (myColor) {
            case BLACK:
                System.out.println("It's a dark color.");
                break;
            case WHITE:
                System.out.println("It's a bright color.");
                break;
            case GRAY:
                System.out.println("It's a neutral color.");
                break;
            case BROWN:
                System.out.println("It's a warm color.");
                break;
        }

        // Получение всех значений перечисления
        System.out.println("All colors:");
        Color[] allColors = Color.values();
        for (Color color : allColors) {
            System.out.println(color);
        }
    }
}