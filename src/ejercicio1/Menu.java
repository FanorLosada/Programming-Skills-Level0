package ejercicio1;

import java.util.Scanner;

public class Menu {
    
    Scanner sc = new Scanner(System.in);
    Metodo m = new Metodo();
    
    public void menu() {
        
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("Ingrese una opcion: ");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Ver");
            System.out.println("4. Transferir dinero");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                
                case 1:
                    System.out.println("Has seleccionado depositar");
                    m.depositar();
                    break;
                case 2:
                    System.out.println("Has seleccionado retirar");
                    m.retirar();
                    break;
                case 3:
                    System.out.println("Has seleccionado ver");
                    m.ver();
                    break;
                case 4:
                    System.out.println("Has seleccionado transferir dinero");
                    m.transferirDinero();
                    break;
                case 5:
                    System.out.println("Has seleccionado salir");
                    break;
                default:
                    System.out.println("Has ingresado un numero incorrecto");
                    menu();
            }

        } while (opcion != 5);
    }  
}
