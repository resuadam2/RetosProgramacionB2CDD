/*
Enunciado: Escribir una función en Java que devuelva el n-ésimo término de la secuencia de Fibonacci.
*/

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Número de términos da secuencia de Fibonacci a calcular
        System.out.println("O " + n + "º término da secuencia de Fibonacci é: " + fibonacci(n));
    }
}
