package Lesson2;

/**
 * @author Gaidukova Olga
 * Задание 2.4. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10. Найти максимальный
 * отрицательный и минимальный положительный элементы массива. Поменять их местами.
 */
public class Task4 {
    public static void main(String[] args) {

        System.out.println("Массив от -10 до 10");

        int[] massive = new int[20];

        for (int i = 0; i < massive.length; i++){
            massive[i] = random(-10, 10);
            System.out.print(massive[i] + " ");
        }


        int iMax = 0;
        int max = -11;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > max && massive[i] < 0) {
                max = massive[i];
                iMax = i;
            }
        }

        int iMin = 0;
        int min = 11;
        for (int j = 0; j < massive.length; j++) {
            if (massive[j] < min && massive[j] > 0) {
                min = massive[j];
                iMin = j;
            }
        }

        massive[iMin] = max;
        massive[iMax] = min;

        System.out.println();
        System.out.println("Максимальный отрицательный элемент массива = " + max);

        System.out.println("Минимальный положительный элемент массива = " + min);

        System.out.println("Массив после смены мест");

        for (int i = 0; i < massive.length; i++){
            System.out.print(massive[i] + " ");
        }

    }

    public static int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}