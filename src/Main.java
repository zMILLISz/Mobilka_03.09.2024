//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Задача 2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number < 9 && number > 2) {
            System.out.println("Число больше 5(?) и меньше 10");
        } else {
            System.out.println("Неизвестное число");
        }
        scanner.close();

// --------------------------------------------------------------------
//        Задача 3
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите сумму вклада: ");
//        double depositAmount = scanner.nextDouble();
//        double interestRate;
//
//        if (depositAmount < 100) {
//            interestRate = 0.05; // 5%
//        } else if (depositAmount >= 100 && depositAmount <= 200) {
//            interestRate = 0.07; // 7%
//        } else {
//            interestRate = 0.10; // 10%
//        }
//
//        double totalAmount = depositAmount + (depositAmount * interestRate);
//        System.out.printf("Сумма вклада с начисленными процентами: %.2f\n", totalAmount);
//        scanner.close();
// --------------------------------------------------------------------
//      Задача 4
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите номер операции:");
//        System.out.println("1. Сложение");
//        System.out.println("2. Вычитание");
//        System.out.println("3. Умножение");
//
//        int operationNumber = scanner.nextInt();
//        String operationName;
//
//        switch (operationNumber) {
//            case 1:
//                operationName = "Сложение";
//                break;
//            case 2:
//                operationName = "Вычитание";
//                break;
//            case 3:
//                operationName = "Умножение";
//                break;
//            default:
//                operationName = "Операция неопределена";
//                break;
//        }
//
//        System.out.println("Вы выбрали: " + operationName);
//        scanner.close();
// --------------------------------------------------------------------
//      Задача 5
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите первое число:");
//        int a = scanner.nextInt();
//
//        System.out.println("Введите второе число:");
//        int b = scanner.nextInt();
//
//        System.out.println("Введите номер операции:");
//        System.out.println("1. Сложение");
//        System.out.println("2. Вычитание");
//        System.out.println("3. Умножение");
//
//        int operationNumber = scanner.nextInt();
//        int operationRes;
//
//        switch (operationNumber) {
//            case 1:
//                operationRes = a + b;
//                System.out.println("Результат сложения: " + operationRes);
//                break;
//            case 2:
//                operationRes = a - b;
//                System.out.println("Результат вычитания: " + operationRes);
//                break;
//            case 3:
//                operationRes = a * b;
//                System.out.println("Результат умножения: " + operationRes);
//                break;
//            default:
//                System.out.println("Операция неопределена");
//                break;
//        }
//        scanner.close();
    }
}