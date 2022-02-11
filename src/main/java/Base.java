import Calculator.Addition;
import Calculator.Division;
import Calculator.Multiplication;
import Calculator.Subtraction;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        double result;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        double number1 = in.nextDouble();
        System.out.print("Введите 2 число: ");
        double number2 = in.nextDouble();
        System.out.println("Введите цифру соответсвующую нужной операции: 1 - '+'; 2 '-'; 3 - '/'; 4 - '*':");
        int sign = in.nextInt();

        switch (sign) {
            case 1:
                Addition addition = new Addition(number1, number2);
                System.out.println("Result = " + addition.result());
                break;
            case 2:
                Subtraction subtraction = new Subtraction(number1, number2);
                System.out.println("Result = " + subtraction.result());
                break;
            case 3:
                Division division = new Division(number1, number2);
                System.out.println("Result = " + division.result());
                break;
            case 4:
                Multiplication multiplication = new Multiplication(number1, number2);
                System.out.println("Result = " + multiplication.result());
                break;
            default:
                throw new RuntimeException("Такой операции нет.");
        }
    }
}
