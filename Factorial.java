
package factorial;


/**
 *
 * @author 
 *
 * Ciclo for
 * Programa para el cálculo del fatorial de un número
 *
 */


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = obtenerNumero(scanner);
        long factorial = calcularFactorial(n);
        mostrarResultado(n, factorial);
    }
    
    public static int obtenerNumero(Scanner scanner) {
        System.out.print("Introduzca un número entero: ");
        int n = scanner.nextInt();
        return n;
    }
    
    public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
    
    public static void mostrarResultado(int n, long factorial) {
        System.out.printf("%d! = %d%n", n, factorial);
    }
}


