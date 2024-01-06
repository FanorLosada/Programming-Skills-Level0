package ejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        String usuario = "a";
        String contrasena = "a";
        
        int numIntentos = 0;
        int intPermitidos = 3;        
        boolean bloquearUsuario = false;        
        
       while(numIntentos < intPermitidos) {
            
            System.out.println("Ingrese el nombre de usuario");
            String usuarioIngresado = sc.nextLine();
            System.out.println("Ingrese la contraseña");
            String contrasenaIngresada = sc.nextLine();
            
                if (usuario.equals(usuarioIngresado) && contrasena.equals(contrasenaIngresada)) {
                    System.out.println("Has ingresado correctamente");
                    Menu m = new Menu();
                    m.menu();
                    break;
                           
                } else {
                    numIntentos++;
                    System.out.println("Has ingresado incorrectamentes");
                }

            if (numIntentos == intPermitidos) {
                System.out.println("Has ingresado incorrectamente");
            }
        } 
    } 
}
