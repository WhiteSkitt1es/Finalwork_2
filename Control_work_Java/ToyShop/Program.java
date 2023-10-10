package ToyShop;
public class Program {
    public static void main(String[] args) {

        Shop shop = new Shop();
        shop.addToy(new Toy("Машинка", 1));
        shop.addToy(new Toy("Кукла", 2));
        shop.addToy(new Toy("Световой меч",3));
        shop.addToy(new Toy("Конструктор", 3));
        shop.addToy(new Toy("Солдатик", 4));
        shop.addToy(new Toy("Бластер", 5));
        shop.addToy(new Toy("Солдатик", 3));
        shop.addToy(new Toy("Плюшевый медведь", 5));
        shop.addToy(new Toy("Человек паук",4));
        shop.addToy(new Toy("Самолет",2));

        for (int i = 0; i < 10; i++) {
            System.out.println(shop.getToy().toString());
        }
    }
}
