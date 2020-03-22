package Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new ACalculatorImplV1();

        // Создавал экземпляр калькулятора с переопределеным методом calculate. В текущий момент в ALogCalculatorImpl закоментирован метод showCalculatorLog.
        Calculator calculatorV2 = new ALogCalculatorImpl();
        // Решил получить доступ к методом и showCalculatorLog и переопрделеленному calculate. Далее пробую подобную реализацию и вывод истории  лишь один раз
        ALogCalculator aCalculator = new ALogCalculatorImpl();

        // calculatorV2.calculate("sum");
        // calculatorV2.calculate("div");
        // calculatorV2.calculate("min");
        // calculatorV2.calculate("mul");
        // calculatorV2.showCalculatorLog();

        aCalculator.calculate("sum");
        aCalculator.calculate("min");
        aCalculator.calculate("div");
        aCalculator.calculate("mul");
        aCalculator.showCalculatorLog();
    }
}
