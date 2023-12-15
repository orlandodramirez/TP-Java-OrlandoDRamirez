import java.util.Scanner;

/**
 * Practica 3 - Ejercicio 2 - FOR2
 */
public class Practica03Ejercicio2 {
    public static void main(String[] args) {
        //variable
        Scanner scanner = new Scanner(System.in);
        int tabla, result;
       //entrada
        System.out.println("Que tabla desea mostrar?");
            tabla = scanner.nextInt();
        //bucle
        for (int i = 1; i < 11; i++) {
            result=i*tabla;
            System.out.println(tabla + "x" + i + "=" + result);
            scanner.close();

        }
    }
}
