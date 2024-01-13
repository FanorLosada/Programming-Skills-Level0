package ejercicio5_level1;

import java.time.LocalDate;
import java.util.Scanner;

public class Aerolinea {
    
    Scanner sc = new Scanner(System.in);
    
    public void ingreso() {
        int intentos = 0;

        String usuario = "Jose";
        String contrasena = "Jose123";
        
        while (intentos > 3) {
            intentos++;
            if(usuario.equals("c") && contrasena.equals("c")){
                destino();
            }
            else{
                System.out.println("Tienes "+intentos+" intentos");
            }
        }
    }

    
    public void destino() {

        //Menu
        System.out.println("Menú de Destinos:");
        System.out.println("1. Turquía");
        System.out.println("2. Grecia");
        System.out.println("3. Líbano");
        System.out.println("4. España");
        System.out.println("5. Portugal");
        
        System.out.println("Seleccione pais de origen");
        int opcionO = sc.nextInt();
        String paisO = "";
        System.out.println("Seleccione pais de destino");
        int opcionD = sc.nextInt();
        String paisD ="";
        
        switch(opcionO){
            case 1: 
                paisO = "Turquia";
                break;
            case 2:
                paisO = "Grecia";
                break;
            case 3:
                paisO = "Libano";
                break;
            case 4:
                paisO = "España";
                break;
            case 5: 
                paisO = "Portugal";
                break;
            case 0:
                break;
        }
        
        switch(opcionD){
            case 1: 
                paisD = "Turquia";
                break;
            case 2:
                paisD = "Grecia";
                break;
            case 3:
                paisD = "Libano";
                break;
            case 4:
                paisD = "España";
                break;
            case 5: 
                paisD = "Portugal";
                break;
            case 0:
                break;
        }        
        //Datos del pasajero
        System.out.println("Ingrese su nombre");
        sc.nextLine();
        String nombrePasajero = sc.nextLine();
        System.out.println("Ingrese su pasaporte");
        String pasaportePasajero = sc.nextLine();
        
        //Fecha
        System.out.println("Ingrese la fecha(YYYY-MM-DD)");
        String fechaVueloS = sc.nextLine();
        LocalDate fechaVuelo = LocalDate.parse(fechaVueloS);
        
        //Tipo de vuelo
        System.out.println("Indique el tipo de vuelo");
        System.out.println("1. Economy");
        System.out.println("2. First Class");
        int opcionVuelo = sc.nextInt();
        String nombreTipoV = "";
        
        switch(opcionVuelo){
            case 1:
                nombreTipoV = "Economy";
                break;
            case 2:
                nombreTipoV= "First Class";
                break;
        }
        
        //Peiza adiccional
        System.out.println("Indique si desea facturar una pieza adicional,(S/N)");
        sc.nextLine();
        String decisionPiezaA = sc.nextLine();
        boolean facturarEquipaje = decisionPiezaA.equals("S");
        
        
        System.out.println("Elija su comida");
        System.out.println("1. Regular");
        System.out.println("2. Vegetariana");
        System.out.println("3. Kosher");
        int comidaOpcion = sc.nextInt();
        String nombreComida = sc.nextLine();
        
        switch(comidaOpcion){
            case 1:
               nombreComida = "Regular";
            case 2:
                nombreComida = "Vegetariana";
            case 3:    
                nombreComida = "Kosher";
        }
        
        //Datos reserva
        System.out.println("Nombre pasajero: "+nombrePasajero);
        System.out.println("Pais de origen: "+paisO);
        System.out.println("Pais de destino: "+paisD);
        System.out.println("Fecha de vuelo: "+fechaVuelo);
        System.out.println("Clase de vuelo: "+nombreTipoV);
        System.out.println("Facturación de equipaje: " + (facturarEquipaje ? "Sí" : "No"));
        System.out.println("Comida elegida: "+nombreComida);
        
        
        System.out.println("Indique si desea realizar su reserva");
        System.out.println("Desea realizarla: (S/N)");
        String respuestaR= sc.nextLine();
        if(respuestaR.equals("S")){
            System.out.println("Su reserva se realizo");
        }
        else{
            destino();
        }
    }
}
    

      

