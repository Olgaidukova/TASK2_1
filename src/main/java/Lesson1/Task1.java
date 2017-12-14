package Lesson1;
import java.util.Scanner; //подключение внешнего пакета

/**
 * @author Gaidukova Olga
 * Задание 1.Начинаем писать калькулятор
 */


public class Task1 { //обьявление нового класса

    public static void main(String[] args) { //обьявление нового метода
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое дробное число: ");
        Double a = in.nextDouble();

        System.out.print("Введите второе дробное число: ");
        Double b = in.nextDouble();

        Double Sum = a + b;
        System.out.printf("Сумма равна: %.4f \n ", Sum);

    }
}