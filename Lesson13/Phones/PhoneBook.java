package Lesson13.Phones;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;


public class PhoneBook {

    Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String name, String number) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(number);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            phoneBook.put(name, numbers);
        }
    }

    public void get(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Найденные номера по фамилии " + name + ":\n" + phoneBook.get(name));
        } else {
            System.out.println("Такого контакта в телефонном справочнике нет");
        }
    }
}