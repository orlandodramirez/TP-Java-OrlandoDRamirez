//programa que suma y multiplica numeros

import java.util.Scanner;

public class SumaProducto{
    public static void main(String[]args){
        //entrada de datos
        Scanner leer.close = new Scanner(System.in);
        int num1, num2, suma, producto;
        System.out.print("Ingrese primer numero:");
        num1 = leer.nextInt();
        System.out.print("Ingrese segundo numero:");
        num2 = leer.nextInt();
        //proceso
        suma = num1 + num2;
        producto = num1 * num2;
        //salida de datos
        System.out.println("Resultado de la suma es "+suma);
        System.out.println("Resultado de la multiplicacion es "+producto);

    }
}