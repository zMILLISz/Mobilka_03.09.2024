//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.time.format.DateTimeParseException;
import java.util.List;

public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

    // 1. Функция для нахождения максимума
    public static int FindMax (int a, int b){
        if (a == b){
            System.err.println("Числа равны!");
        }
        return Math.max(a, b);
    }
    // 2. Калькулятор деления
    public static double divide(double numerator, double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Недопустимо деление на ноль.");
        }
        return numerator / denominator;
    }

    // 3. Конвертер строк в числа
    public static int convertStringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Невозможно конвертировать строку в целое число.");
        }
    }

    // 4. Проверка возраста
    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст должен быть в пределах 0-150.");
        }
    }

    // 5. Нахождение корня
    public static double findSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательное число не имеет квадратного корня.");
        }
        return Math.sqrt(number);
    }

    // 6. Факториал
    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел.");
        }
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // 7. Проверка массива на нули
    public static void checkArrayForZeros(int[] array) {
        for (int num : array) {
            if (num == 0) {
                throw new IllegalArgumentException("Массив содержит нули.");
            }
        }
    }

    // 8. Калькулятор возведения в степень
    public static double power(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Степень не должна быть отрицательной.");
        }
        return Math.pow(base, exponent);
    }

    // 9. Обрезка строки
    public static String trimString(String str, int length) {
        if (length > str.length()) {
            throw new IllegalArgumentException("Длина обрезки превышает длину строки.");
        }
        return str.substring(0, length);
    }

    // 10. Поиск элемента в массиве
    public static int findElementInArray(int[] array, int element) {
        for (int num : array) {
            if (num == element) {
                return num;
            }
        }
        throw new IllegalArgumentException("Элемент не найден в массиве.");
    }

    // 11. Конвертация в двоичную систему
    public static String convertToBinary(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательные числа не могут быть конвертированы в двоичную систему.");
        }
        return Integer.toBinaryString(number);
    }

    // 12. Проверка делимости
    public static boolean isDivisible(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Недопустимо деление на ноль.");
        }
        return a % b == 0;
    }

    // 13. Чтение элемента списка
    public static <T> T getElementFromList(java.util.List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка.");
        }
        return list.get(index);
    }

    // 14. Парольная проверка
    public static void checkPasswordStrength(String password) {
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Пароль слишком слабый.");
        }
    }

    // 15. Проверка даты
    public static void checkDate(String date) {
        if (!date.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new DateTimeParseException("Некорректная дата", date, 0);
        }
    }

    // 16. Конкатенация строк
    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null!");
        }
        return str1 + str2;
    }

    // 17. Остаток от деления
    public static int remainder(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Недопустимо деление на ноль.");
        }
        return a % b;
    }

    // 18. Квадратный корень
    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательное число не имеет квадратного корня.");
        }
        return Math.sqrt(number);
    }

    // 19. Конвертер температуры
    public static double convertCelsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура не может быть ниже абсолютного нуля.");
        }
        return (celsius * 9/5) + 32;
    }

    // 20. Проверка строки на пустоту
    public static void checkStringEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пустая или равна null.");
        }
    }
}