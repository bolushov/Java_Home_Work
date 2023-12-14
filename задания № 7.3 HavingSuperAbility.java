// суперспособности
interface HavingSuperAbility {
    void applySuperAbility();
}

// Абстрактный класс героя
abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String superAbilityType;

    public Hero(int health, int damage, String superAbilityType) {
        this.health = health;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbilityType() {
        return superAbilityType;
    }
}

// Классы конкретных героев
class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, "Magic Power");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность MAGIC POWER");
    }
}

class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, "Healing");
        this.healPoints = healPoints;
    }

    public void increaseExperience() {
        healPoints += (int) (healPoints * 0.1); // Увеличение лечебного опыта на 10%
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEALING");
    }
}

class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, "Critical Damage");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем массив из 3 героев
        Hero[] heroes = {
            new Magic(100, 20),
            new Medic(120, 15, 30),
            new Warrior(150, 25)
        };

        // Применяем суперспособность каждого героя через цикл
        for (Hero hero : heroes) {
            hero.applySuperAbility();

            // Если герой - Medic, увеличиваем опыт лечения
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }

            // Выводим информацию о герое
            System.out.println("Health: " + hero.getHealth() +
                               ", Damage: " + hero.getDamage() +
                               ", Super Ability Type: " + hero.getSuperAbilityType());
            System.out.println();
        }
    }
}
