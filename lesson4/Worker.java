package lesson4;

public class Worker {
    private String firstName;
    private String lastName;
    private String secondName;
    private String position;
    private String email;
    private long phone;
    private int salary;
    private int age;

    public Worker(String firstName, String lastName, String secondName, String position, String email, long phone, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info () {
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Отчество: " + secondName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        Worker worker1 = new Worker("Аслан", "Дидаев", "Бекханович", "ученик", "test@test.com", 1234567890, 00000, 23);
        worker1.info();
    }
}