//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      Задача 1
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число четное");
        }else {
            System.out.println("Число нечетное");
        }
        scanner.close();

//      Задача 2
//        System.out.println("Введите первое число:");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Введите второе число:");
//        int num2 = scanner.nextInt();
//
//        System.out.println("Введите третье число:");
//        int num3 = scanner.nextInt();
//
//        int min = Math.min(num1, Math.min(num2, num3));
//        System.out.println("Минимальное число: " + min);
//        scanner.close();

//      Задача 3
//        System.out.println("Таблица умножения на 5:");
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("5 * " + i + " = " + (5 * i));
//        }
//        scanner.close();

//      Задача 4
//        System.out.print("Введите целое число N для суммы от 1 до N: ");
//        int N = scanner.nextInt();
//        int sum = (N * (N + 1)) / 2;
//        System.out.println("Сумма чисел от 1 до " + N + " = " + sum);
//        scanner.close();

//      Задача 5
//        System.out.print("Введите целое число N для чисел Фибоначчи: ");
//        int fibN = scanner.nextInt();
//        int a = 0, b = 1;
//        System.out.print("Числа Фибоначчи: ");
//        for (int i = 1; i <= fibN; i++) {
//            System.out.print(a + " ");
//            int next = a + b;
//            a = b;
//            b = next;
//        }
//        System.out.println();
//        scanner.close();

//      Задача 6
//        System.out.print("Введите целое число для проверки простоты: ");
//        int primeNumber = scanner.nextInt();
//        boolean isPrime = primeNumber > 1;
//        for (int i = 2; i <= Math.sqrt(primeNumber); i++) {
//            if (primeNumber % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        System.out.println(primeNumber + " является простым: " + isPrime);
//        scanner.close();

//      Задача 7
//        System.out.print("Введите целое число N для обратного порядка: ");
//        int reverseN = scanner.nextInt();
//        System.out.print("Числа от " + reverseN + " до 1: ");
//        for (int i = reverseN; i >= 1; i--) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        scanner.close();

//      Задача 8
//        System.out.print("Введите два целых числа A и B для суммы четных чисел: ");
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//        int evenSum = 0;
//        for (int i = A; i <= B; i++) {
//            if (i % 2 == 0) {
//                evenSum += i;
//            }
//        }
//        System.out.println("Сумма четных чисел от " + A + " до " + B + " = " + evenSum);
//        scanner.close();

//      Задача 9
//        System.out.print("Введите строку для реверса: ");
//        String str = scanner.nextLine();
//        String reversedStr = new StringBuilder(str).reverse().toString();
//        System.out.println("Реверс строки: " + reversedStr);
//        scanner.close();

//      Задача 10
//        System.out.print("Введите целое число для подсчета цифр: ");
//        int digitCount = Math.abs(scanner.nextInt());
//        System.out.println("Количество цифр: " + String.valueOf(digitCount).length());
//        scanner.close();

//      Задача 11
//        System.out.print("Введите целое число N для факториала: ");
//        int factorialN = scanner.nextInt();
//        long factorial = 1;
//        for (int i = 1; i <= factorialN; i++) {
//            factorial *= i;
//        }
//        System.out.println("Факториал " + factorialN + " = " + factorial);
//        scanner.close();

//      Задача 12
//        System.out.print("Введите целое число для суммы цифр: ");
//        int sumDigits = Math.abs(scanner.nextInt());
//        int sumOfDigits = 0;
//        while (sumDigits > 0) {
//            sumOfDigits += sumDigits % 10;
//            sumDigits /= 10;
//        }
//        System.out.println("Сумма цифр = " + sumOfDigits);
//        scanner.close();

//      Задача 13
//        System.out.print("Введите строку для проверки на палиндром: ");
//        String palindromeCheck = scanner.nextLine();
//        String normalizedString = palindromeCheck.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        String reversedPalindrome = new StringBuilder(normalizedString).reverse().toString();
//        System.out.println("Строка является палиндромом: " + normalizedString.equals(reversedPalindrome));
//        scanner.close();

//      Задача 14
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//        System.out.print("Элемент " + (i + 1) + ": ");
//            array[i] = scanner.nextInt();
//        }
//        int max = array[0];
//        for (int num : array) {
//            if (num > max) {
//                max = num;
//            }
//        }
//        System.out.println("Максимальное число в массиве: " + max);
//        scanner.close();

//      Задача 15
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//            System.out.print("Элемент " + (i + 1) + ": ");
//            array[i] = scanner.nextInt();
//        }
//        int sum = 0;
//        for (int num : array) {
//            sum += num;
//        }
//        System.out.println("Сумма всех элементов массива: " + sum);
//        scanner.close();

//      Задача 16
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//            System.out.print("Элемент " + (i + 1) + ": ");
//            array[i] = scanner.nextInt();
//        }
//
//        int positiveCount = 0;
//        int negativeCount = 0;
//
//        for (int num : array) {
//            if (num > 0) {
//                positiveCount++;
//            } else if (num < 0) {
//                negativeCount++;
//            }
//        }
//        System.out.println("Количество положительных чисел: " + positiveCount);
//        System.out.println("Количество отрицательных чисел: " + negativeCount);
//        scanner.close();

//      Задача 17
//        System.out.print("Введите два целых числа A и B для поиска простых чисел: ");
//        int startRange = scanner.nextInt();
//        int endRange = scanner.nextInt();
//        System.out.println("Простые числа в диапазоне от " + startRange + " до " + endRange + ":");
//        for (int i = startRange; i <= endRange; i++) {
//            if (i > 1) {
//                boolean isPrimeRange = true;
//                for (int j = 2; j <= Math.sqrt(i); j++) {
//                    if (i % j == 0) {
//                        isPrimeRange = false;
//                        break;
//                    }
//                }
//                if (isPrimeRange) {
//                    System.out.print(i + " ");
//                }
//            }
//        }
//        scanner.close();

//      Задача 18
//        System.out.print("Введите строку для подсчета гласных и согласных(только английский алфавит): ");
//        String vowelsString = scanner.nextLine();
//        int vowelsCount = 0, consonantsCount = 0;
//        for (char c : vowelsString.toCharArray()) {
//            if (Character.isLetter(c)) {
//                if ("AEIOUYaeiouy".contains(String.valueOf(c))) {
//                    vowelsCount++;
//                } else {
//                    consonantsCount++;
//                }
//            }
//        }
//        System.out.println("Количество гласных: " + vowelsCount);
//        System.out.println("Количество согласных: " + consonantsCount);
//        scanner.close();

//      Задача 19
//        System.out.print("Введите строку с несколькими словами: ");
//        String[] words = scanner.nextLine().split(" ");
//        StringBuilder reversedWords = new StringBuilder();
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversedWords.append(words[i]).append(" ");
//        }
//        System.out.println("Слова в обратном порядке: " + reversedWords.toString().trim());
//        scanner.close();

//      Задача 20
//        System.out.print("Введите целое число для проверки на число Армстронга: ");
//        int armstrongNumber = scanner.nextInt();
//        int digitsCount = String.valueOf(armstrongNumber).length();
//        int sumOfPowers = 0;
//        int temp = armstrongNumber;
//        while (temp > 0) {
//            int digit = temp % 10;
//            sumOfPowers += Math.pow(digit, digitsCount);
//            temp /= 10;
//        }
//        System.out.println(armstrongNumber + " является числом Армстронга: " + (sumOfPowers == armstrongNumber));
//        scanner.close();
    }
}