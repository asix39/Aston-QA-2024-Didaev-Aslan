public class Person {
    private String lastName;
    private String firstName;
    private String secondName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String lastName, String firstName, String secondName, String position, String email, String phone, int salary, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Отчество: " + secondName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
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
    }
}