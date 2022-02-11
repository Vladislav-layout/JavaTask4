package Calculator;

public class Subtraction extends Abstract {
    public Subtraction(double num1, double num2) {
        super(num1, num2);
    }

    public double result() {
        return super.getNum1() - super.getNum2();
    }
}