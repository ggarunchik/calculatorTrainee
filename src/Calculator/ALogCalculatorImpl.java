package Calculator;

import Calculator.utils.CalculatorUtil;
import Calculator.utils.OperationUtil;
import Calculator.utils.ReaderUtil;
import Calculator.utils.WriterUtil;

import java.util.ArrayList;

public class ALogCalculatorImpl extends ALogCalculator {

    private OperationUtil[] resultHistory = new OperationUtil[50];
    private ArrayList<OperationUtil> resultHistoryArray = new ArrayList<>();

    // private void addCalculatorLog(String operationType, double firstInput, double secondInput, double result) {
    //     for (int i = 0; i < resultHistory.length; i++) {
    //         if (resultHistory[i] == null) {
    //            resultHistory[i] = new OperationUtil(operationType, firstInput, secondInput, result);
    //            break;
    //          }
    //    }
    // }

    private void addCalculatorLogArray(String operationType, double firstInput, double secondInput, double result) {
        resultHistoryArray.add(new OperationUtil(operationType, firstInput, secondInput, result));
    }

    @Override
    public void showCalculatorLog() {
        // System.out.println("History:");
        for (int i = 0; i < resultHistoryArray.size(); i++) {
            if (resultHistoryArray.get(i) == null) {
                break;
            }
            System.out.println(resultHistoryArray.get(i));
        }
    }

    @Override
    public void calculate(String apType) {
        switch (apType) {
            case "sum":
                WriterUtil.displayString("Enter 2 double to SUM:");
                double sumFirstInput = ReaderUtil.readDouble();
                double sumSecondInput = ReaderUtil.readDouble();
                WriterUtil.displayDouble(CalculatorUtil.sum(sumFirstInput, sumSecondInput));
                //  addCalculatorLog(apType, sumFirstInput, sumSecondInput, CalculatorUtil.sum(sumFirstInput, sumSecondInput));
                addCalculatorLogArray(apType, sumFirstInput, sumSecondInput, CalculatorUtil.sum(sumFirstInput, sumSecondInput));
                //    showCalculatorLog();
                break;
            case "div":
                WriterUtil.displayString("Enter 2 double to DIV:");
                double divFirstInput = ReaderUtil.readDouble();
                double divSecondInput = ReaderUtil.readDouble();
                WriterUtil.displayDouble(CalculatorUtil.div(divFirstInput, divSecondInput));
                //     addCalculatorLog(apType, divFirstInput, divSecondInput, CalculatorUtil.div(divFirstInput, divSecondInput));
                addCalculatorLogArray(apType, divFirstInput, divSecondInput, CalculatorUtil.div(divFirstInput, divSecondInput));
                //      showCalculatorLog();
                break;
            case "mul":
                WriterUtil.displayString("Enter 2 double to MUL:");
                double mulFirstInput = ReaderUtil.readDouble();
                double mulSecondInput = ReaderUtil.readDouble();
                WriterUtil.displayDouble(CalculatorUtil.mul(mulFirstInput, mulSecondInput));
                //  addCalculatorLog(apType, mulFirstInput, mulSecondInput, CalculatorUtil.mul(mulFirstInput, mulSecondInput));
                addCalculatorLogArray(apType, mulFirstInput, mulSecondInput, CalculatorUtil.mul(mulFirstInput, mulSecondInput));
                //       showCalculatorLog();
                break;
            case "min":
                WriterUtil.displayString("Enter 2 double to MIN:");
                double minFirstInput = ReaderUtil.readDouble();
                double minSecondInput = ReaderUtil.readDouble();
                WriterUtil.displayDouble(CalculatorUtil.min(minFirstInput, minSecondInput));
                //   addCalculatorLog(apType, minFirstInput, minSecondInput, CalculatorUtil.min(minFirstInput, minSecondInput));
                addCalculatorLogArray(apType, minFirstInput, minSecondInput, CalculatorUtil.min(minFirstInput, minSecondInput));
                //     showCalculatorLog();
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
