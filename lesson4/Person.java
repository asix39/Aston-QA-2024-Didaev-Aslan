package lesson4;

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
}