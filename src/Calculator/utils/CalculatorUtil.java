package Calculator.utils;

/**
 * Операционный клас для выполнения математических операций
 */

public class CalculatorUtil {
    public static double sum(double a, double b) {
        return a + b;
    }

    //TODO Добавить валидацию деления на ноль
    public static double div(double a, double b) {
        return a / b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double min(double a, double b) {
        return a - b;
    }
}
