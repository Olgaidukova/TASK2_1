package Lesson2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Gaidukova Olga
 * Задание 2.5. Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 * !!!!На редактировании!!!!
 */



public class Task5 {
    public static void main(String args[]) {
        ArrayList<Sweet> list = new ArrayList<Sweet>();
        list.add(new Chupachups("Chupachups", 56,1000, "klubnika"));
        list.add(new Mars("Mars", 67, 200, 3500));
        list.add(new Snikers ("Snikers", 300, 450,"5 nuts"));

        ArrayList<Sweet> choice = new ArrayList<Sweet>();

        System.out.println("введите название сладости");
        Scanner scan = new Scanner(System.in);
        String choiceBase = scan.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(choiceBase)) {
                choice.add(list.get(i));
                System.out.println("в корзине находится " + choice.get(i).getName());
            }
        }

    }

}

abstract class Sweet {
    private String name;
    private Integer weight;
    private Integer price;

    public Sweet(String name, Integer weight, Integer price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name= " + name  + ", weight=" + weight + ", price=" + price;
    }
}
class Chupachups extends Sweet {
    private String vkus;
    public Chupachups(String name, Integer weight, Integer price, String vkus) {
        super(name, weight, price);
        this.vkus=vkus;
    }

    public String getVkus() {
        return vkus;
    }

    public void setVkus(String vkus) {
        this.vkus = vkus;
    }

    @Override
    public String toString() {
        return super.toString()+", vkus=" + vkus;
    }
}
class Mars extends Sweet {
    private Integer kkal;
    public Mars(String name, Integer weight, Integer price, Integer kkal) {
        super(name, weight, price);
        this.kkal=kkal;
    }

    public Integer getKkal() {
        return kkal;
    }

    public void setKkal(Integer kkal) {
        this.kkal = kkal;
    }

    @Override
    public String toString() {
        return super.toString()+", kkal=" + kkal;
    }

}
class Snikers extends Sweet {
    private String nuts;
    public Snikers(String name, Integer weight, Integer price, String nuts) {
        super(name, weight, price);
        this.nuts=nuts;
    }

    public String getNuts() {
        return nuts;
    }

    public void setNuts(String nuts) {
        this.nuts = nuts;
    }

    @Override
    public String toString() {
        return super.toString()+", nuts=" + nuts;
    }
}


