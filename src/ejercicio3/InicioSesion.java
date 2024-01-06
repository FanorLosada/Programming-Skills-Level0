package ejercicio3;

import java.util.Scanner;

public class InicioSesion {

    Scanner sc = new Scanner(System.in);
    
    public static int opcion; 
    public static int contadorLo = 0;
    public static int contadorM = 0;
    public static int contadorLi = 0;    
    public static int opcionC;
    
    public void Menu() {

        String nombreUsuario = "c";
        String contrasena = "c";
        int intentos = 0;
        
        while (intentos < 3) {
            intentos++;
            System.out.println("UNIVERSIDAD");
            System.out.println("Ingrese su nombre de usuario");
            sc.nextLine();
            String nombreI = sc.nextLine();
            System.out.println("Ingrese su contraseña");
            String contrasenaI = sc.nextLine();

            if (nombreI.equals(nombreUsuario) && contrasena.equals(contrasenaI)) {
                menuCarreras();
            } else {
                System.out.println("Has ingresado datos incorrectos");
            }
        }
    }
    
    public void menuCarreras(){ 
                  
        System.out.println("Indica la carrera que deseas estudiar");
        System.out.println("1. Ciencias de la Computacion");
        System.out.println("2. Medicina");
        System.out.println("3. Marketing");
        System.out.println("4. Artes");          
        
        opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
            case 2:
            case 3:
            case 4:
                contadorCarreras();
        }
    }
    
    public void contadorCarreras(){
        
        int contadorC = 0; 
        int contadorMe = 0; 
        int contadorMa = 0; 
        int contadorA = 0; 
        
        switch (opcion) {
            case 1:
                contadorC ++;
                if(contadorC> 5){
                    System.out.println("Los cupos estan completos");
                    break;
                }
                else break;
            case 2:
                contadorMe++;
                if (contadorMe > 5) {
                    System.out.println("Los cupos estan completos");
                    break;
                }
                else break;
            case 3:
                contadorMa++;
                if (contadorMa > 5) {
                    System.out.println("Los cupos estan completos");
                    break;
                }
                else break;
            case 4:
                contadorA++;
                if (contadorA > 5) {
                    System.out.println("Los cupos estan completos");
                    break;
                }
                else break;
            case 5:
                break;
        }
        datos();
    }
    
    public void datos(){
        
        String nombres;
        String apellidos; 
        String programaElegido;
        
        System.out.println("Ingrese sus nombres");
        sc.nextLine();
        nombres = sc.nextLine();
        System.out.println("Ingrese sus apellidos");
        apellidos = sc.nextLine();
        System.out.println("Ingrese su programa elegido");
        programaElegido = sc.nextLine();
        
        campus();
    }
    
    public void campus() {

        System.out.println("Indique el campus");
        System.out.println("1. Londres");
        System.out.println("2. Manchester");
        System.out.println("3. Liverpool");
        System.out.println("4. Salir");

        opcionC = sc.nextInt();
        
        switch (opcionC) {
            case 1:
            case 2:
            case 3:
                campusEspacios();
                break;
            case 4:
                sc.close();
                System.exit(0);
                
        }
    }
    
    public void campusEspacios(){
                
        switch (opcionC) {
            case 1:
                contadorLo++;
                if(contadorLo > 1){
                    System.out.println("Los cupos estan completos");
                    break;
                }
                else{
                    System.out.println("Bienvenido");
                    break;
                }
                
            case 2:
                contadorM++;
                if (contadorM > 3) {
                    System.out.println("Los cupos estan completos");
                    break;
                }
                else{
                    System.out.println("Bienvenido");
                    break;
                }
                
            case 3:
                contadorLi++;
                if(contadorLi > 1){
                    System.out.println("Los cupos estan completos");
                    break;                    
                }
                else{
                    System.out.println("Bienvenido");
                    break;
                }
        }
    } 
}
