package Calculator;

public class Addition extends Abstract {
    public Addition(double num1, double num2) {
        super(num1, num2);
    }

    public double result() {
        return super.getNum1() + super.getNum2();
    }
}
