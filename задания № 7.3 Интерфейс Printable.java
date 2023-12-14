// Интерфейс Printable
interface Printable {
    void print();
}

// 1-й уровень иерархии (родительский класс)
class Parent implements Printable {
    private String parentProperty;

    public Parent(String parentProperty) {
        this.parentProperty = parentProperty;
    }

    public String getParentProperty() {
        return parentProperty;
    }

    @Override
    public void print() {
        System.out.println("Parent Property: " + parentProperty);
    }
}

// 2-й уровень иерархии
class Child2 extends Parent {
    private String child2Property;

    public Child2(String parentProperty, String child2Property) {
        super(parentProperty);
        this.child2Property = child2Property;
    }

    public String getChild2Property() {
        return child2Property;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Child2 Property: " + child2Property);
    }
}

// 3-й уровень иерархии
class Child3 extends Parent {
    private int child3Property;

    public Child3(String parentProperty, int child3Property) {
        super(parentProperty);
        this.child3Property = child3Property;
    }

    public int getChild3Property() {
        return child3Property;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Child3 Property: " + child3Property);
    }
}

// 4-й уровень иерархии
class Child4 extends Parent {
    private boolean child4Property;

    public Child4(String parentProperty, boolean child4Property) {
        super(parentProperty);
        this.child4Property = child4Property;
    }

    public boolean isChild4Property() {
        return child4Property;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Child4 Property: " + child4Property);
    }
}

// Главный класс Main
public class Main {
    public static void main(String[] args) {
        // Создаем объекты с помощью метода createObject
        Printable object2 = createObject("2й", "ParentProperty", "Child2Property");
        Printable object3 = createObject("3й", "ParentProperty", 42);
        Printable object4 = createObject("4й", "ParentProperty", true);

        // Выводим информацию о каждом объекте
        object2.print();
        System.out.println();
        object3.print();
        System.out.println();
        object4.print();
    }

    // Метод createObject, создающий объекты различных типов
    public static Printable createObject(String type, String parentProperty, Object childProperty) {
        switch (type) {
            case "2й":
                return new Child2(parentProperty, (String) childProperty);
            case "3й":
                return new Child3(parentProperty, (int) childProperty);
            case "4й":
                return new Child4(parentProperty, (boolean) childProperty);
            default:
                throw new IllegalArgumentException("Unsupported type: " + type);
        }
    }
}
