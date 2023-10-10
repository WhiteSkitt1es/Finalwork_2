package ToyShop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Shop {
    PriorityQueue<Toy> toys;

    public Shop() {
        toys = new PriorityQueue<>(Comparator.comparingInt(Toy::getChance));
    }
    public void addToy(Toy toy){
        toys.add(toy);
    }
    public Toy getToy(){
        if(toys.isEmpty()){
            throw new RuntimeException("Игрушки кончились!");
        }
        writeToy(toys.peek().toString());
        return toys.poll();
    }
    private void writeToy(String message){
        try(FileWriter fw = new FileWriter("shop.txt",true)) {
            fw.write(message + "\n");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
