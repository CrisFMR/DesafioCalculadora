package cl.praxis.models;

public class Calculadora {

    private int num1;
    private int num2;


    public int suma(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int resta(int num1, int num2) {
        int res = num1 - num2;
        return res;
    }

    public int multiplicacion(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }

    public int division(int num1, int num2) {
        int div = num1 / num2;
        return div;
    }

}

