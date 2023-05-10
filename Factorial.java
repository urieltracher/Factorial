
package factorial;
import java.util.Scanner;

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

        
        System.out.print("Introduzca un número entero: ");
        int n = scanner.nextInt();

        
        long factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }

        
        System.out.printf("%d! = %d%n", n, factorial);
    }
}

