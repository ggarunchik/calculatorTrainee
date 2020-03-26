package Calculator.utils;

/**
 * Операционый класс, который будет создавать ОБЪЕКТ и содержать в себе историю калькулятора
 */
public class OperationUtil implements Comparable<OperationUtil> {
    private String operationType;
    private double firstValue;
    private double secondValue;
    private double operationResult;

    /**
     * Конструктор класса, с полями необходимыми для красивой истории.
     *
     * @param operationType   сюда пихнем назавание выполняемой операции
     * @param firstValue      значение первого ввода пользователя
     * @param secondValue     значение второго ввода пользователя
     * @param operationResult результат операции
     */

    public OperationUtil(String operationType, double firstValue, double secondValue, double operationResult) {
        this.operationType = operationType;
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operationResult = operationResult;
    }

    public OperationUtil() {
    }

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public double getOperationResult() {
        return operationResult;
    }

    public void setOperationResult(double operationResult) {
        this.operationResult = operationResult;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * Даем возможность красиво вывести содержимое объекта
     */

    @Override
    public String toString() {
        return "Calculator History: {" +
                "operationType='" + operationType + '\'' +
                ", firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                ", operationResult=" + operationResult +
                '}';
    }

    @Override
    public int compareTo(OperationUtil o) {
        if (this.operationResult > o.getOperationResult()) {
            return 1;
        } else if (this.operationResult == o.getOperationResult()) {
            return 0;
        }
        return -1;
    }
}
