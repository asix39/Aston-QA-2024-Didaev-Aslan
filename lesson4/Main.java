package lesson4;

public class Main{
    public static void main(String[] args){
        // Изначально я установил тип данных long для номеров телефона, но компилятор почему ругался и я прибегнул к строковому типу данных String.
        // Не понимаю почему компилятор ругался.
        Person[] person = new Person[5];
        person[0] = new Person("Киселёв","Евгений", "Дмитриевич", "геодезист", "kisel@gmail.com", "89114433225", 70000, 30);
        person[1] = new Person("Макеева", "Алина", "Игоревна", "архитектор", "alinkoks@ya.ru", "88888888888", 100000, 18);
        person[2] = new Person("Васневская", "Лариса", "Евгеньевна", "ландшафтный дизайнер", "vasnev@mail.ru", "33333333333", 60000, 50);
        person[3] = new Person("Гарифуллин", "Рим", "Айратович", "зам.зама", "garri_potter@hog.com", "55555555555", 65000, 35);
        person[4] = new Person("Дидаев", "Аслан", "Бекханович", "ученик", "asya@mail.ru", "11111111111", 0, 23);
        person[0].info();
        person[1].info();
        person[2].info();
        person[3].info();
        person[4].info();
        // Не знал как как цифровые значения со знаком ":" установить на int.
        // Поэтому оставил String
        Park attraction1 = new Park("Американские горки", "10:00", "20:00", "13:00", "13:30", "17:00", "17:30", 250, 150);
        Park attraction2 = new Park("Викинги", "10:00", "20:00", "13:30", "14:00", "16:30", "17:00", 200, 100 );
        Park attraction3 = new Park("Ракушки", "09:00", "21:00","12:30", "13:30", "17:00", "17:30", 150,100);
        attraction1.infoAttraction();
        attraction2.infoAttraction();
        attraction3.infoAttraction();
    }
}