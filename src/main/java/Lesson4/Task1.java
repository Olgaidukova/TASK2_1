package Lesson4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Задание 4.1. Прочитать слова из файла.
 * Отсортировать в алфавитном порядке.
 * Посчитать сколько раз каждое слово встречается в файле. Вывести статистику на консоль
 * Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 */

public class Task1 {
    private Scanner scanner;
    private Map<String, Integer> statistics;

    public Task1(String path) throws FileNotFoundException {
        readFromFile(path);
    }

    public Map<String, Integer> getStatistics() {
        return statistics;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // чтение из файла
        Task1 task1 = new Task1("C:\\Users\\Ольга\\IdeaProjects\\TASK2_1\\src\\main\\java\\Lesson4\\input");

        System.out.println("Слова из файла: ");
        System.out.println(task1.getStatistics());

        task1.alphabeticalOrdering(task1.getStatistics());

        System.out.println("Наиболее распространенное слово: ");
        task1.mostOften(task1.getStatistics());

    }

    void readFromFile(String path) throws FileNotFoundException {
        scanner = new Scanner(new File(path));
        statistics = new HashMap<String, Integer>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }
    }

    void alphabeticalOrdering (Map<String, Integer> statis) {
        Set<String> words = new TreeSet<String>();
        Iterator<Map.Entry<String,Integer>>entryIterator1 = statis.entrySet().iterator();
        while (entryIterator1.hasNext()){
            words.add(entryIterator1.next().getKey());
        }
        System.out.println("Алфавитный порядок слов");
        System.out.println(words);
    }

    void mostOften (Map<String, Integer> statis) {
        int max = 0;
        String maxKey = null;
        for (String e: statis.keySet()){
            if (statis.get(e) > max) {
                max = statis.get(e);
                maxKey = e;
            }
        }
        System.out.println("maxKey: " + maxKey + ", maxValue: " + max);
    }
}
