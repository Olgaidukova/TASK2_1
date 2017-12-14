package Lesson2;
import java.util.Scanner;

/**
 * @author Gaidukova Olga
 */
public class Task1_2_3 {// новый класс для выбора калькулятора или массива

    public static void main(String[] args) {
        System.out.println("Введите 1 - чтобы вызвать калькулятор или 2 - чтобы вызвать поиск максимального слова в массиве");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        switch (answer) {
            case 1:
                Calc calc = new Calc();
                calc.calc();
                break;
            case 2:
                Array array = new Array();
                System.out.println(array.maxLengthWord());
                break;
        }
    }

    /**
     * Задание 2.1: базовые операции для калькулятора
     */
    static class Calc { //обьявление нового класса для калькулятора

        public void calc() { //обьявление нового метода для калькулятора
            Scanner in = new Scanner(System.in);

            System.out.print("Введите первое дробное число: ");
            Double a = in.nextDouble();

            System.out.print("Введите второе дробное число: ");
            Double b = in.nextDouble();

            System.out.println("Выберете операцию (+,-,*,/): ");
            char с = in.next().charAt(0);
            switch (с) {
                case '+':
                    Double sum = a + b;
                    System.out.printf("Сумма равна: %.4f\n", sum);
                    break;
                case '-':
                    Double div = a - b;
                    System.out.printf("Разница равна: %.4f\n", div);
                    break;
                case '*':
                    Double mult = a * b;
                    System.out.printf("Умножение равно: %.4f\n", mult);
                    break;
                case '/':
                    Double quot = a / b;
                    System.out.printf("Деление равно: %.4f\n", quot);
                    break;
            }
        }
    }

    /**
     * Задание 2.2: поиск максимального элемента в массиве
     */

    public static class Array { //обьявление нового класса для массива
        private String array[];
        private int arr_length;
        private Scanner scanner = new Scanner(System.in);

        public Array() {
            System.out.println("Введите длину массива: ");
            setArr_length(scanner.nextInt());
            System.out.println("Введите элементы массива по порядку: ");
            String words[] = new String[arr_length];
            for (int i = 0; i < arr_length; i++) {
                words[i] = scanner.next();
            }
            setArray(words);
        }

        public void setArray(String arr[]) {
            this.array = new String[arr.length];
            for (int i = 0; i < arr.length; i++) {
                this.array[i] = arr[i];
            }
        }

        public String[] getArray() {
            return array;
        }

        public int getArr_length() {
            return arr_length;
        }

        public void setArr_length(int arr_length) {
            this.arr_length = arr_length;
        }

        public String maxLengthWord() {
            String maxWord = this.array[0];
            int max = this.array[0].length();
            for (int i = 0; i < getArr_length(); i++) {
                if (this.array[i].length() > max) {
                    maxWord = this.array[i];
                    max = this.array[i].length();
                }
            }
            return maxWord;
        }
    }
}

