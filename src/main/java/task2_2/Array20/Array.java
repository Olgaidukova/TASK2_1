package task2_2.Array20;

import java.util.Random;

/**
 * @author Gaidukova Olga
 * Задание 2.4. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10. Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
 */
public class Array {
    public static final int array_length = 20;
    public static void main(String[] args) {
        int indexMaxNegative, indexMinPositive;
        boolean negative = true, positive = true;
        int randNumbers[] = new int[array_length];
        for (int i = 0; i < array_length; i++){
            Random random = new Random();
            randNumbers[i] = -10 + random.nextInt(11+10);
            System.out.println(i + ") " + randNumbers[i]);
        }
        indexMaxNegative = findMaxNegativeIndex(randNumbers);
        System.out.println("Максимальное отрицательное число " + randNumbers[indexMaxNegative]);
        if (indexMaxNegative == 1000) {
            System.out.println("Нет отрицательных чисел");
            negative = false;
        }
        indexMinPositive = findMinPositive(randNumbers);
        System.out.println("Минимальное положительное число " + randNumbers[indexMinPositive]);
        if (indexMinPositive == 1000) {
            System.out.println("Нет положительных чисел");
            positive = false;
        }

        if (positive && negative) {
            substitute(randNumbers,indexMaxNegative,indexMinPositive);
            for (int i = 0; i < array_length; i++) {
                System.out.println(i + ") " + randNumbers[i]);
            }
        }
        else System.out.println("\n" + "Нет положительного или отрицательного числа, ничего не менять");
    }


    /**
     * @param array найти максимальный отрицательный элемент
     * @return максимальное отрицательное число в массиве
     */
    public static int findMaxNegativeIndex(int array[]){
        int maxNegative = -1000;
        int indexMaxNegative = 1000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                maxNegative = array[i];
                indexMaxNegative = i;
                break;
            }
        }
        if (maxNegative != -1000) {
            for (int i = 0; i < array.length; i++) {
                if ((array[i] > maxNegative) && (array[i] < 0)) {
                    maxNegative = array[i];
                    indexMaxNegative = i;
                }
            }
        }
        return indexMaxNegative;
    }

    /**
     * @param array найти минимальный положительный элемент
     * @return минимальное положительное число в массиве
     */
    public static int findMinPositive(int array[]){
        int minPositive = 1000;
        int indexMinPositive = 1000;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0) {
                minPositive = array[i];
                indexMinPositive = i;
                break;
            }
        }

        if (minPositive != 1000) {
            for (int i = 0; i < array.length; i++) {
                if ((array[i] > 0) && (array[i] < minPositive)) {
                    minPositive = array[i];
                    indexMinPositive = i;
                }
            }
        }
        return indexMinPositive;
    }


    /**
     * @param array где будет изменено максимальное отрицательное и минимальное положительное число
     * @param indexMaxNeg - индекс максимального отрицательного числа
     * @param indexMinPos - индекс минимального положительного числа
     * @return обновить массив
     */
    public static int [] substitute (int array[], int indexMaxNeg, int indexMinPos) {
        int tmp = array[indexMaxNeg];
        array[indexMaxNeg] = array[indexMinPos];
        array[indexMinPos] = tmp;
        return array;
    }
}

