//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.time.format.DateTimeParseException;
import java.util.List;

////Задача 1
//interface Animal {
//    void eat();
//    void sleep();
//}
//
//abstract class Mammal implements Animal {
//    public abstract void walk();
//}
//
//class Lion extends Mammal {
//    @Override
//    public void eat() {
//        System.out.println("Лев кушает мясо.");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("Лев спит в тени.");
//    }
//
//    @Override
//    public void walk() {
//        System.out.println("Лев идет.");
//    }
//}
//
//class Elephant extends Mammal {
//    @Override
//    public void eat() {
//        System.out.println("Слон ест траву и листья.");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("Слон спит стоя.");
//    }
//
//    @Override
//    public void walk() {
//        System.out.println("Слон идет медленно.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Lion lion = new Lion();
//        Elephant elephant = new Elephant();
//
//        // Поведение льва
//        System.out.println("Поведение льва:");
//        lion.eat();
//        lion.sleep();
//        lion.walk();
//
//        System.out.println();
//
//        // Поведение слона
//        System.out.println("Поведение слона:");
//        elephant.eat();
//        elephant.sleep();
//        elephant.walk();
//    }
//}

////Задача 2
//interface Shape {
//    double area();
//    double perimeter();
//}
//
//abstract class Polygon implements Shape {
//    public abstract int numberOfSides();
//}
//
//class Triangle extends Polygon {
//    private double side1;
//    private double side2;
//    private double side3;
//
//    public Triangle(double side1, double side2, double side3) {
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = side3;
//    }
//
//    @Override
//    public double area() {
//        double s = perimeter() / 2; // Полупериметр
//        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
//    }
//
//    @Override
//    public double perimeter() {
//        return side1 + side2 + side3;
//    }
//
//    @Override
//    public int numberOfSides() {
//        return 3;
//    }
//}
//
//class Rectangle extends Polygon {
//    private double width;
//    private double height;
//
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    @Override
//    public double area() {
//        return width * height;
//    }
//
//    @Override
//    public double perimeter() {
//        return 2 * (width + height);
//    }
//
//    @Override
//    public int numberOfSides() {
//        return 4;
//    }
//}
//
//class Circle implements Shape {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public double area() {
//        return Math.PI * radius * radius;
//    }
//
//    @Override
//    public double perimeter() {
//        return 2 * Math.PI * radius;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Triangle triangle = new Triangle(3, 4, 5);
//        Rectangle rectangle = new Rectangle(5, 10);
//        Circle circle = new Circle(7);
//
//        System.out.println("Треугольник:");
//        System.out.println("Площадь: " + triangle.area());
//        System.out.println("Периметр: " + triangle.perimeter());
//        System.out.println("Количество сторон: " + triangle.numberOfSides());
//        System.out.println();
//
//        System.out.println("Прямоугольник:");
//        System.out.println("Площадь: " + rectangle.area());
//        System.out.println("Периметр: " + rectangle.perimeter());
//        System.out.println("Количество сторон: " + rectangle.numberOfSides());
//        System.out.println();
//
//        System.out.println("Круг:");
//        System.out.println("Площадь: " + circle.area());
//        System.out.println("Периметр: " + circle.perimeter());
//    }
//}

////Задача 3
//interface Device {
//    void turnOn();
//    void turnOff();
//}
//
//abstract class ElectronicDevice implements Device {
//    public abstract int getPowerConsumption();
//}
//
//class TV extends ElectronicDevice {
//    private boolean isOn;
//
//    public TV() {
//        this.isOn = false;
//    }
//
//    @Override
//    public void turnOn() {
//        isOn = true;
//        System.out.println("Телевизор включен.");
//    }
//
//    @Override
//    public void turnOff() {
//        isOn = false;
//        System.out.println("Телевизор выключен.");
//    }
//
//    @Override
//    public int getPowerConsumption() {
//        return 100;
//    }
//}
//
//class Computer extends ElectronicDevice {
//    private boolean isOn;
//
//    public Computer() {
//        this.isOn = false;
//    }
//
//    @Override
//    public void turnOn() {
//        isOn = true;
//        System.out.println("Компьютер включен.");
//    }
//
//    @Override
//    public void turnOff() {
//        isOn = false;
//        System.out.println("Компьютер выключен.");
//    }
//
//    @Override
//    public int getPowerConsumption() {
//        return 250;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        TV tv = new TV();
//        Computer computer = new Computer();
//
//        System.out.println("Управление устройствами:");
//
//        tv.turnOn();
//        System.out.println("Потребляемая мощность телевизора: " + tv.getPowerConsumption() + " Вт");
//        tv.turnOff();
//        System.out.println();
//
//        computer.turnOn();
//        System.out.println("Потребляемая мощность компьютера: " + computer.getPowerConsumption() + " Вт");
//        computer.turnOff();
//    }
//}

////Задача 4
//interface Product {
//    double getPrice();
//    String getName();
//}
//
//abstract class PhysicalProduct implements Product {
//    private String name;
//    private double price;
//
//    public PhysicalProduct(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public double getPrice() {
//        return price;
//    }
//
//    public abstract double getWeight();
//}
//
//class Book extends PhysicalProduct {
//    private double weight;
//
//    public Book(String name, double price, double weight) {
//        super(name, price);
//        this.weight = weight;
//    }
//
//    @Override
//    public double getWeight() {
//        return weight;
//    }
//}
//
//class Software implements Product {
//    private String name;
//    private double price;
//
//    public Software(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public double getPrice() {
//        return price;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Book book = new Book("Великий Гэтсби", 499.99, 0.3);
//        Software software = new Software("Антивирус", 1999.99);
//
//        System.out.println("Товары в магазине:");
//        System.out.println("Название: " + book.getName() + ", Цена: " + book.getPrice() + " руб., Вес: " + book.getWeight() + " кг");
//        System.out.println("Название: " + software.getName() + ", Цена: " + software.getPrice() + " руб.");
//    }
//}

//Задача 5
interface Athlete {
    void train();
    void compete();
}

abstract class Runner implements Athlete {
    private double bestTime;

    public Runner(double bestTime) {
        this.bestTime = bestTime;
    }

    public double getBestTime() {
        return bestTime;
    }
}

class Sprinter extends Runner {

    // Конструктор
    public Sprinter(double bestTime) {
        super(bestTime);
    }

    @Override
    public void train() {
        System.out.println("Бегун тренируется на максимальной скорости на короткие дистанции.");
    }

    @Override
    public void compete() {
        System.out.println("Бегун участвует в забеге на 100 метров.");
    }
}

class MarathonRunner extends Runner {

    // Конструктор
    public MarathonRunner(double bestTime) {
        super(bestTime);
    }

    @Override
    public void train() {
        System.out.println("Марафонец тренируется на длинные дистанции для повышения выносливости.");
    }

    @Override
    public void compete() {
        System.out.println("Марафонец участвует в марафоне на 34 километра.");
    }
}

// Основной класс для тестирования
public class Main {
    public static void main(String[] args) {
        Sprinter sprinter = new Sprinter(7.45);
        MarathonRunner marathonRunner = new MarathonRunner(100.0);

        System.out.println("Спортсмены: ");

        sprinter.train();
        sprinter.compete();
        System.out.println("Лучшее время бегуна: " + sprinter.getBestTime() + " секунд.\n");

        marathonRunner.train();
        marathonRunner.compete();
        System.out.println("Лучшее время марафонца: " + marathonRunner.getBestTime() + " минут.");
    }
}