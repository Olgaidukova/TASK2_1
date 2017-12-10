package Gifts;
import java.util.ArrayList;


    /**
     * @author Gaidukova Olga
     * Задание 2.5. Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
     * У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
     * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
     */

    public class GIft {
        private ArrayList<Sweet>sweetArrayList = new ArrayList<Sweet>();
        public ArrayList<Sweet> getSweetArrayList() {
            return sweetArrayList;
        }
        public static void main(String[] args) {
            /**
             * Определить сладости
             */
            Cookie milka = new Cookie("Milka", 0.125, 100, "chocolate");
            Jellybean haribo = new Jellybean("Haribo", 0.1, 50, 0.3);
            Candy ferrero = new Candy("Ferrero", 0.15, 200, "chocolate");

            /**
             * Создать подарок
             */
            GIft gift = new GIft();

            /**
             * Добавить сладости в подарок
             */
            gift.getSweetArrayList().add(milka);
            gift.getSweetArrayList().add(haribo);
            gift.getSweetArrayList().add(ferrero);

            /**
             * Общий вес подарка
             */
            double totalWeight = 0;
            for (Sweet sweets: gift.getSweetArrayList()) {
                totalWeight += sweets.getWeight();
            }
            System.out.println("Общий вес подарка: " + totalWeight);

            /**
             * Общая стоимость подарка
             */
            float totalCost = 0;
            for (Sweet sweet: gift.getSweetArrayList()) {
                totalCost += sweet.getCost();
            }
            System.out.println("Общая стоимость подарка: " + totalCost);

            /**
             * Информация о сладостях в подарке
             */
            System.out.println("Подарок состоит из:");
            for (Sweet sweet: gift.getSweetArrayList()) {
                System.out.println(sweet.toString());
            }
        }
    }
