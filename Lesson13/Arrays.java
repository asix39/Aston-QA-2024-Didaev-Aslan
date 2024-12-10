package Lesson13;

import java.util.ArrayList;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {
        //Создание массива
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Яблоко");
        list1.add("Апельсин");
        list1.add("Картофель");
        list1.add("Мандарин");
        list1.add("Капуста");
        list1.add("Яблоко");
        list1.add("Апельсин");
        list1.add("Картофель");
        list1.add("Яблоко");
        list1.add("Картофель");
        list1.add("Яблоко");
        list1.add("Грейпфрут");
        list1.add("Ананас");
        list1.add("Маракуйя");
        list1.add("Мандарин");
        list1.add("Капуста");
        list1.add("Яблоко");

        //Выводим все уникальные слова из списка
        HashSet<String> uniqueWords = new HashSet<>(list1);
        System.out.println("Уникальные слова: " + uniqueWords);

        //Считаем, сколько раз встречается каждое слово в списке
        for (String word : uniqueWords) {
            int count = 0;
            for (String listWord : list1) {
                if (word.equals(listWord)) {
                    count++;
                }
            }
            System.out.println(word + " - " + count);
        }
    }
}
