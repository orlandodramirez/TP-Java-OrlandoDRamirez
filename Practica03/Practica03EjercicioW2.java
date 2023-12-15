import java.util.Scanner;

public class Practica03EjercicioW2 {
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String usuarioCorrecto = "admin";
        int pin;
        int pinCorrecto = 1234567;
        int correcto = 0;
        System.out.println("Acceso al sistema.! ");
        while (correcto <= 0) {
            //entradas
             System.out.println("Ingrese su usario:");
            usuario = scanner.nextLine();
            System.out.println("Ingrese su pin:");
            pin = scanner.nextInt();
            //verificar
            if ((usuario.equals(usuarioCorrecto)) && (pin == pinCorrecto)) {
                correcto = 1;
            }
            System.out.println("Usuario y/o pin incorrecto.! ");
            scanner.nextLine(); //reset string
        }
        System.out.println("Bienvenido al sistema.!");
        scanner.close();
    }
}
