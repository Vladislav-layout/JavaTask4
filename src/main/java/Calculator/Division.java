package Calculator;

public class Division extends Abstract{
    public Division(double num1, double num2) {
        super(num1, num2);
    }

    public double result() {
        return super.getNum1() / super.getNum2();
    }
}
