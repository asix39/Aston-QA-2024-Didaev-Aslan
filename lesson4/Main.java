package lesson4;

public class Main{
    public static void main(String[] args){
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

        Park[] attraction = new Park[3];
        attraction[0] = new Park("Американские горки", "10:00", "20:00", "13:00", "13:30", "17:00", "17:30", 250, 150);
        attraction[1] = new Park("Викинги", "10:00", "20:00", "13:30", "14:00", "16:30", "17:00", 200, 100 );
        attraction[2] = new Park("Ракушки", "09:00", "21:00","12:30", "13:30", "17:00", "17:30", 150,100);
        attraction[0].infoAttraction();
        attraction[1].infoAttraction();
        attraction[2].infoAttraction();
    }
}