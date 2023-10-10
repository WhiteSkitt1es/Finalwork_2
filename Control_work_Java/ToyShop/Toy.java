package ToyShop;

public class Toy {
    private static int identifier = 1;
    private int id;
    private String name;
    private int chance;

    public Toy(String name, int chance) {
        this.name = name;
        if(chance <= 0 || chance > 5){
            throw new RuntimeException("Введите вероятность выпадения от 1 до 5");
        } else {
            this.chance = chance;
        }
        this.id = identifier++;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getChance() {
        return chance;
    }
    @Override
    public String toString() {
        return "Игрушка № " + id + " " + name + " вероятность выпадения " + chance;
    }
}
