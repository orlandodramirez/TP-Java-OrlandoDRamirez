/**
 * Practica3 - Ejercicio 2 - FOR2.1
 */
public class Practica03Ejercicio21 {

    public static void main(String[] args) {
        //variables
        int tabla;
        int result;
        //bucle 1
        for (tabla = 1; tabla < 11; tabla++) {
            //salida
            System.out.println("-----------------------------");
            System.out.println(" Mostrando tabla del " + tabla);
            System.out.println("-----------------------------");
            //bucle 2
            for (int i = 1; i < 11; i++) {
                result = tabla * i;
                System.out.println(tabla + " x " + i + " = " + result);
            }
        }
    }
}