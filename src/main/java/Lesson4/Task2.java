package Lesson4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Gaidukova Olga
 * Задание 4.2. Добавить обработку исключений в задание с ООП калькулятором
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            try {
                System.out.print("Введите первое дробное число: ");
                double firstNumber = scanner.nextDouble();
                System.out.print("Введите второе дробное число: ");
                double secondNumber = scanner.nextDouble();
                System.out.print("Выберете операцию (+,-,*,/): ");
                char op = scanner.next().charAt(0);
                Lesson4.Calc calc = new Lesson4.Calc(op, firstNumber, secondNumber);

            } catch (InputMismatchException a){
                System.out.println("Неверный формат числа");
            } catch (ArithmeticException ex) {
                System.out.println("ОШИБКА:Была попытка поделить на 0");
            }


            System.out.println("Продолжить? Y/N");
            char answer = scanner.next().charAt(0);

            switch (answer){
                case 'Y':
                    flag = true;
                    break;
                case 'N':
                    flag = false;
                    break;
                default:
                    flag = true;
                    break;
            }
        }
    }
}

interface Operation {

    double getResult();
}


class Calc {
    private Lesson4.Operation result;

    public Calc (char op, double a, double b){
        switch (op){
            case '+':
                result = new Lesson4.Sum(a, b);
                System.out.println(result.getResult());
                break;
            case '-':
                result = new Lesson4.Div(a, b);
                System.out.println(result.getResult());
                break;
            case '*':
                result = new Lesson4.Mult(a, b);
                System.out.println(result.getResult());
                break;
            case '/' :
                result = new Lesson4.Quotient(a, b);
                System.out.println(result.getResult());
                break;
            default:
                result = new Lesson4.Sum(a, b);
                System.out.println(result.getResult());
                break;
        }
    }

}


class Sum implements Lesson4.Operation {
    private double a;
    private double b;
    private double result;

    public Sum (double a_, double b_){
        setA(a_);
        setB(b_);
        setResult(a+b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}

class Div implements Lesson4.Operation {
    private double a;
    private double b;
    private double result;

    public Div (double a_, double b_){
        setA(a_);
        setB(b_);
        setResult(a - b);
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getResult() {
        return result;
    }
}


class Mult implements Lesson4.Operation {
    private double a;
    private double b;
    private double result;

    public Mult(double a_, double b_){
        setA(a_);
        setB(b_);
        setResult(a * b);
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }
}
class Quotient implements Lesson4.Operation {
    private double a;
    private double b;
    private double result;

    public Quotient (double a_, double b_) {
        setA(a_);
        setB(b_);
        if(b==0) throw new ArithmeticException("поделили на ноль");
        setResult(a / b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}

