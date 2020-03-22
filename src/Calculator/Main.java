package Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new ACalculatorImplV1();
        Calculator calculatorV2 = new ALogCalculatorImpl();

        calculatorV2.calculate("sum");
        calculatorV2.calculate("div");
        calculatorV2.calculate("min");
        calculatorV2.calculate("mul");
       // calculatorV2.showCalculatorLog();
}
}
