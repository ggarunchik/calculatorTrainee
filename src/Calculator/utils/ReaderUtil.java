package Calculator.utils;

import java.util.Scanner;

/**
 * Операционный класс для считывания пользовательского ввода
 */

public class ReaderUtil {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Метод для считывая ввода пользователя. Так же метод реализует проверку ввода пользователя. Покуда значение != double просим повторить ввод
     * @return возвращает пользовательский ввод
     */
    public static double readDouble() {
        double input;
        while (!scanner.hasNextDouble()) {
            String userInput = scanner.next();
            System.out.printf("\"%s\" is not DOUBLE.\n", userInput);
        }
        input = scanner.nextDouble();
        return input;
    }

    public static double readInt() {
        double input;
        while (!scanner.hasNextInt()) {
            String userInput = scanner.next();
            System.out.printf("\"%s\" is not INT.\n", userInput);
        }
        input = scanner.nextInt();
        return input;
    }
}
