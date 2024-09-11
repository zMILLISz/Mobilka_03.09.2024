//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.time.format.DateTimeParseException;
import java.util.List;

//Задача 1
//class Person {
//    private String name;
//    private int age;
//    private String gender;
//
//    public Person(String name, int age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//
//    public void displayInfo() {
//        System.out.println("Имя: " + name + ", Возвраст: " + age + ", Пол: " + gender);
//    }
//
//    public void incrementAge() {
//        age++;
//    }
//
//    public void changeName(String newName) {
//        name = newName;
//    }
//}

//Задача 2
//class Worker extends Person {
//    private double salary;
//
//    public Worker(String name, int age, String gender, double salary) {
//        super(name, age, gender);
//        this.salary = salary;
//    }
//}
//
//class Manager extends Worker {
//    private int numberOfSubordinates;
//
//    public Manager(String name, int age, String gender, double salary, int numberOfSubordinates) {
//        super(name, age, gender, salary);
//        this.numberOfSubordinates = numberOfSubordinates;
//    }
//}

//Задача 3
//interface Animal {
//    void makeSound();
//}
//
//class Dog implements Animal {
//    public void makeSound() {
//        System.out.println("Гав!");
//    }
//}
//
//class Cat implements Animal {
//    public void makeSound() {
//        System.out.println("Мяу!");
//    }
//}
//
//class Cow implements Animal {
//    public void makeSound() {
//        System.out.println("Му!");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal[] animals = {new Dog(), new Cat(), new Cow()};
//        for (Animal animal : animals) {
//            animal.makeSound();
//        }
//    }
//}

//Задача 4
//abstract class Transport {
//    abstract void move();
//}
//
//class Car extends Transport {
//    void move() {
//        System.out.println("Машина едет.");
//    }
//}
//
//class Bike extends Transport {
//    void move() {
//        System.out.println("Велосипед едет.");
//    }
//}

//Задача 5
//import java.util.ArrayList;
//
//class Book {
//    private String title;
//    private String author;
//    private int year;
//
//    public Book(String title, String author, int year) {
//        this.title = title;
//        this.author = author;
//        this.year = year;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public int getYear() {
//        return year;
//    }
//}
//
//class Library {
//    private ArrayList<Book> books = new ArrayList<>();
//
//    public void addBook(Book book) {
//        books.add(book);
//    }
//
//    public void findByAuthor(String author) {
//        for (Book book : books) {
//            if (book.getAuthor().equals(author)) {
//                System.out.println("Книга: " + book.getAuthor());
//            }
//        }
//    }
//
//    public void findByYear(int year) {
//        for (Book book : books) {
//            if (book.getYear() == year) {
//                System.out.println("Книга: " + book.getAuthor());
//            }
//        }
//    }
//}

//Задача 6
//class BankAccount {
//    private String accountNumber;
//    private double balance;
//
//    public BankAccount(String accountNumber) {
//        this.accountNumber = accountNumber;
//        this.balance = 0;
//    }
//
//    public void deposit(double amount) {
//        balance += amount;
//    }
//
//    public void withdraw(double amount) {
//        if (amount <= balance) {
//            balance -= amount;
//        } else {
//            System.out.println("Недостаточно средств!");
//        }
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//}

//Задача 7
//class Counter {
//    private static int count = 0;
//
//    public Counter() {
//        count++;
//    }
//
//    public static int getCount() {
//        return count;
//    }
//}

//Задача 8
//abstract class Shape {
//    abstract double getArea();
//}
//
//class Circle extends Shape {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    double getArea() {
//        return Math.PI * radius * radius;
//    }
//}
//
//class Rectangle extends Shape {
//    private double width;
//    private double height;
//
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    double getArea() {
//        return width * height;
//    }
//}

//Задача 9
//class Animal {
//    void move() {
//        System.out.println("Животное движется.");
//    }
//}
//
//class Fish extends Animal {
//    void move() {
//        System.out.println("Рыба плавает.");
//    }
//}
//
//class Bird extends Animal {
//    void move() {
//        System.out.println("Птица летает.");
//    }
//}
//
//class Dog extends Animal {
//    void move() {
//        System.out.println("Собака бегает.");
//    }
//}

//Задача 10
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class Student {
//    private String name;
//    private String group;
//    private double grade;
//
//    public Student(String name, String group, double grade) {
//        this.name = name;
//        this.group = group;
//        this.grade = grade;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getGrade() {
//        return grade;
//    }
//}
//
//class University {
//    private ArrayList<Student> students = new ArrayList<>();
//
//    public void addStudent(Student student) {
//        students.add(student);
//    }
//
//    public void sortByName() {
//        Collections.sort(students, Comparator.comparing(Student::getName));
//    }
//
//    public void filterByGrade(double minGrade) {
//        for (Student student : students) {
//            if (student.getGrade() >= minGrade) {
//                System.out.println("Студент: " + student.getName());
//            }
//        }
//    }
//}

//Задача 11
//import java.util.ArrayList;
//
//class Product {
//    private String name;
//    private double price;
//    private int quantity;
//
//    public Product(String name, double price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Store {
//    private ArrayList<Product> products = new ArrayList<>();
//
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public void removeProduct(Product product) {
//        products.remove(product);
//    }
//
//    public Product findByName(String name) {
//        for (Product product : products) {
//            if (product.getName().equals(name)) {
//                return product;
//            }
//        }
//        return null;
//    }
//}

//Задача 12
//interface PaymentSystem {
//    void pay();
//    void refund();
//}
//
//class CreditCard implements PaymentSystem {
//    public void pay() {
//        System.out.println("Оплата кредитной картой.");
//    }
//
//    public void refund() {
//        System.out.println("Возврат средств на кредитную карту.");
//    }
//}
//
//class PayPal implements PaymentSystem {
//    public void pay() {
//        System.out.println("Оплата через PayPal.");
//    }
//
//    public void refund() {
//        System.out.println("Возврат средств через PayPal.");
//    }
//}

//Задача 13
//import java.util.UUID;
//
//class UniqueID {
//    private static int count = 0;
//    private String id;
//
//    public UniqueID() {
//        this.id = UUID.randomUUID().toString();
//        count++;
//    }
//
//    public static int getCount() {
//        return count;
//    }
//
//    public String getId() {
//        return id;
//    }
//}

//Задача 14
//class Point {
//    private double x;
//    private double y;
//
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//}
//
//class Rectangle {
//    private Point topLeft;
//    private Point bottomRight;
//
//    public Rectangle(Point topLeft, Point bottomRight) {
//        this.topLeft = topLeft;
//        this.bottomRight = bottomRight;
//    }
//
//    public double getArea() {
//        double width = bottomRight.getX() - topLeft.getX();
//        double height = topLeft.getY() - bottomRight.getY();
//        return width * height;
//    }
//}

//Задача 15
//class ComplexNumber {
//    private double real;
//    private double imaginary;
//
//    public ComplexNumber(double real, double imaginary) {
//        this.real = real;
//        this.imaginary = imaginary;
//    }
//
//    public ComplexNumber add(ComplexNumber other) {
//        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
//    }
//
//    public ComplexNumber subtract(ComplexNumber other) {
//        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
//    }
//
//    public ComplexNumber multiply(ComplexNumber other) {
//        return new ComplexNumber(this.real * other.real - this.imaginary * other.imaginary,
//                this.real * other.imaginary + this.imaginary * other.real);
//    }
//
//    public ComplexNumber divide(ComplexNumber other) {
//        double denominator = other.real * other.real + other.imaginary * other.imaginary;
//        return new ComplexNumber((this.real * other.real + this.imaginary * other.imaginary) / denominator,
//                (this.imaginary * other.real - this.real * other.imaginary) / denominator);
//    }
//}

//Задача 16
//class Matrix {
//    private int[][] data;
//
//    public Matrix(int rows, int cols) {
//        data = new int[rows][cols];
//    }
//
//    public Matrix add(Matrix other) {
//        // Проверка и добавление.
//        return new Matrix(data.length, data[0].length); // Упрощенно
//    }
//
//    public Matrix multiply(Matrix other) {
//        // Проверка и умножение.
//        return new Matrix(data.length, other.data[0].length); // Упрощенно
//    }
//}

//Задача 17
//class Player {
//    private String name;
//    private int health;
//
//    public Player(String name) {
//        this.name = name;
//        this.health = 100;
//    }
//
//    public void attack(Enemy enemy) {
//        System.out.println(name + " атакует " + enemy.getName());
//        enemy.takeDamage(10);
//    }
//}
//
//class Enemy {
//    private String name;
//    private int health;
//
//    public Enemy(String name) {
//        this.name = name;
//        this.health = 100;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void takeDamage(int amount) {
//        health -= amount;
//        System.out.println(name + " получил " + amount + " урона.");
//    }
//}
//
//class Weapon {
//    private String name;
//    private int damage;
//
//    public Weapon(String name, int damage) {
//        this.name = name;
//        this.damage = damage;
//    }
//}

//Задача 18
//import java.util.ArrayList;
//
//class Product {
//    private String name;
//    private double price;
//
//    public Product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//}
//
//class Order {
//    private ArrayList<Product> products = new ArrayList<>();
//
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public double totalCost() {
//        double total = 0;
//        for (Product product : products) {
//            total += product.getPrice();
//        }
//        return total;
//    }
//}
//
//class Customer {
//    private String name;
//
//    public Customer(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}

//Задача 19
//class Device {
//    private String brand;
//
//    public Device(String brand) {
//        this.brand = brand;
//    }
//
//    public void turnOn() {
//        System.out.println("Устройство включено.");
//    }
//
//    public void turnOff() {
//        System.out.println("Устройство выключено.");
//    }
//}
//
//class Smartphone extends Device {
//    public Smartphone(String brand) {
//        super(brand);
//    }
//
//    public void takePhoto() {
//        System.out.println("Снимок сделан.");
//    }
//}
//
//class Laptop extends Device {
//    public Laptop(String brand) {
//        super(brand);
//    }
//}

//Задача 20
import java.util.Scanner;

// Класс для представления игрока
class Player {
    private String name;
    private char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}

// Класс для управления логикой игры
class Game {
    private char[][] board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    public void makeMove(int row, int col) {
        board[row][col] = currentPlayer.getSymbol();
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public boolean checkWin() {
        char symbol = (currentPlayer == player1) ? player2.getSymbol() : player1.getSymbol();
        // Проверка строк, столбцов и диагоналей
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }
        return (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

// Класс для запуска игры
public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();

        Player player1 = new Player(name1, 'X');
        Player player2 = new Player(name2, 'O');
        Game game = new Game(player1, player2);

        while (true) {
            game.printBoard();
            System.out.print(game.currentPlayer.getName() + ", введите строку и столбец (например, 1 2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.isValidMove(row, col)) {
                game.makeMove(row, col);
                if (game.checkWin()) {
                    game.printBoard();
                    System.out.println("Поздравляем! Игрок " + (game.currentPlayer == player1 ? player2.getName() : player1.getName()) + " победил!");
                    break;
                }
                if (game.isBoardFull()) {
                    game.printBoard();
                    System.out.println("Игра окончилась вничью!");
                    break;
                }
            } else {
                System.out.println("Недопустимый ход, попробуйте еще раз.");
            }
        }
        scanner.close();
    }
}


