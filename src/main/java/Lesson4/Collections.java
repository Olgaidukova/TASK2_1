package Lesson4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Задание 4. Прочитать слова из файла.
 * Отсортировать в алфавитном порядке.
 * Посчитать сколько раз каждое слово встречается в файле. Вывести статистику на консоль
 * Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 */

public class Collections {
    public static void main(String[] args) throws FileNotFoundException {
        // чтение слов из файла
        Scanner scanner = new Scanner(new File("C:\\Users\\Ольга\\IdeaProjects\\TASK2_1\\src\\main\\resources"));
        Map<String, Integer> statistics = new HashMap<String, Integer>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }

        // вывод статистики на консоль
        System.out.println(statistics);

        // дерево для вывода слов в алфавитном порядке
       /* Set<String> words = new TreeSet<String>();
        Iterator<Map.Entry<String,Integer>>entryIterator1 = statistics.entrySet().iterator();
        while (entryIterator1.hasNext()){
            words.add(entryIterator1.next().getKey());
        }
        System.out.println(words);*/

        // поиск самого часто встречающегося слова
        int max = 0;
        String maxKey = null;
        for (String e: statistics.keySet()){
            if (statistics.get(e) > max) {
                // max = statistics.get(e);
            }
        }

    }


}
