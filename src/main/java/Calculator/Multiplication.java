package Calculator;

public class Multiplication extends Abstract {
    public Multiplication(double num1, double num2) {
        super(num1, num2);
    }

    public double result() {
        return super.getNum1() * super.getNum2();
    }
}
