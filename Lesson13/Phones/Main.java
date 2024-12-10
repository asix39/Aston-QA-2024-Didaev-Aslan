package Lesson13.Phones;

public class Main {
    public static void main(String[] args) {
        // Добавление номеров телефонов
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Васнецов", "8(921)573-21-34");
        phoneBook.add("Петров", "8(921)892-75-53");
        phoneBook.add("Сидоров", "8(952)135-90-80");
        phoneBook.add("Сидоров", "8(952)291-54-30");
        phoneBook.add("Иванов", "8(911)463-60-82");
        phoneBook.add("Васнецов", "8(921)505-50-43");

        phoneBook.get("Васнецов");
    }
}