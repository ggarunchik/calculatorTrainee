package Calculator;

import Calculator.utils.CalculatorUtil;
import Calculator.utils.OperationUtil;
import Calculator.utils.ReaderUtil;
import Calculator.utils.WriterUtil;

import java.util.Set;
import java.util.TreeSet;

public class ALogCalculatorWithSortImpl extends  ALogCalculatorWithSort {
    private Set<OperationUtil> resultSet = new TreeSet<>();

    @Override
    public void showCalculatorLogAndSortResult() {
        System.out.println(resultSet);
    }

    @Override
    public void calculate(String apType) {
        switch (apType) {
            case "sum":
                WriterUtil.displayString("Enter 2 double to SUM:");
                double sumFirstInput = ReaderUtil.readDouble();
                double sumSecondInput = ReaderUtil.readDouble();
                WriterUtil.displayDouble(CalculatorUtil.sum(sumFirstInput, sumSecondInput));
                addCalculatorLogArrayAndSort(apType, sumFirstInput, sumSecondInput, CalculatorUtil.sum(sumFirstInput, sumSecondInput));
                break;
            case "div":
                WriterUtil.displayString("Enter 2 double to DIV:");
                double divFirstInput = ReaderUtil.readDouble();
                double divSecondInput = ReaderUtil.readDouble();
                WriterUtil.displayDouble(CalculatorUtil.div(divFirstInput, divSecondInput));
                addCalculatorLogArrayAndSort(apType, divFirstInput, divSecondInput, CalculatorUtil.div(divFirstInput, divSecondInput));
                break;
            case "mul":
                WriterUtil.displayString("Enter 2 double to MUL:");
                double mulFirstInput = ReaderUtil.readDouble();
                double mulSecondInput = ReaderUtil.readDouble();
                WriterUtil.displayDouble(CalculatorUtil.mul(mulFirstInput, mulSecondInput));
                addCalculatorLogArrayAndSort(apType, mulFirstInput, mulSecondInput, CalculatorUtil.mul(mulFirstInput, mulSecondInput));
                break;
            case "min":
                WriterUtil.displayString("Enter 2 double to MIN:");
                double minFirstInput = ReaderUtil.readDouble();
                double minSecondInput = ReaderUtil.readDouble();
                WriterUtil.displayDouble(CalculatorUtil.min(minFirstInput, minSecondInput));
                addCalculatorLogArrayAndSort(apType, minFirstInput, minSecondInput, CalculatorUtil.min(minFirstInput, minSecondInput));
                break;
            default:
                System.out.println("default");
                break;
        }

    }

    private void addCalculatorLogArrayAndSort(String operationType, double firstInput, double secondInput, double result) {
        resultSet.add(new OperationUtil(operationType, firstInput, secondInput, result));
    }
}
