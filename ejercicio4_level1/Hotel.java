package ejercicio4_level1;

import java.util.Scanner;

public class Hotel {
    
    Scanner sc = new Scanner(System.in);
    
    public void iniciarSesion(){
        
    }
    
    public void menu(){
        
        System.out.println("Ingrese el pais: ");
        System.out.println("1. España");
        System.out.println("2. Francia");
        System.out.println("3. Portugal");
        System.out.println("4. Italia");
        System.out.println("5. Alemania");
        int opcion = sc.nextInt();
        
        
        
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el lugar de su hotel: ");
                System.out.println("1.Madrid\n2.Barcelona\n3.Valencia");
                int lugarE = sc.nextInt();
                habitacion();
                break;
            case 2:
                System.out.println("Ingrese el lugar de su hotel: ");
                System.out.println("1.Paris\n2.Marsella");
                int lugarPA = sc.nextInt();
                habitacion();
                break;
            case 3:
                System.out.println("Ingrese el lugar de su hotel: ");
                System.out.println("1.Madeira\n2.Lisboa\n3.Oporto");
                int lugarPO = sc.nextInt();
                habitacion();
                break;
            case 4:
                System.out.println("Ingrese el lugar de su hotel: ");
                System.out.println("1.Roma\n2.Milan");
                int lugarI = sc.nextInt();
                habitacion();
                break;
            case 5:
                System.out.println("Ingrese el lugar de su hotel: ");
                System.out.println("1.Munich\n2.Berlin");
                int lugarA = sc.nextInt();
                habitacion();
                break;
        }
        
    }
    
    public void habitacion() {

        System.out.println("Indique el tipo de habitacion");
        System.out.println("1. Suites VIP");
        System.out.println("2. Habitaciones individuales");
        System.out.println("3. Habitaciones dobles");
        System.out.println("4. Habitaciones para grupos");
        System.out.println("5. Suites de lujo");
        int opcionH = sc.nextInt();
        
        if(opcionH == 1){
            System.out.println("Cuantas habitaciones desea: ");
            
            int cantidadHabitacionesSV = sc.nextInt();
            int contadorSV = 0;
            
            
            if(cantidadHabitacionesSV <= 6){
                System.out.println("Has sobrepasado el limite de habitaciones"); 
            }
            else{
                System.out.println("Felicidades");
                contadorSV += cantidadHabitacionesSV;
                System.out.println("El costo es de: "+(cantidadHabitacionesSV*450));
            }
              
        }
        
        if(opcionH == 2){
            System.out.println("Cuantas habitaciones desea: ");
            
            int cantidadHabitacionesI = sc.nextInt();
            int contadorI = 0;
            
            
            if(cantidadHabitacionesI <= 3){
                System.out.println("Has sobrepasado el limite de habitaciones"); 
            }
            else{
                System.out.println("Felicidades");
                contadorI += cantidadHabitacionesI;
                System.out.println("El costo es de: "+(cantidadHabitacionesI*100));
            }
            
        }        
        
        if(opcionH == 3){
            System.out.println("Cuantas habitaciones desea: ");
            
            int cantidadHabitacionesD = sc.nextInt();
            int contadorD = 0;
            
            
            if(cantidadHabitacionesD <= 3){
                System.out.println("Has sobrepasado el limite de habitaciones"); 
            }
            else{
                System.out.println("Felicidades");
                contadorD += cantidadHabitacionesD;
                System.out.println("El costo es de: "+(cantidadHabitacionesD*200));
            } 
        }          
        
        
        if(opcionH == 4){
            System.out.println("Cuantas habitaciones desea: ");
            
            int cantidadHabitacionesG = sc.nextInt();
            int contadorG = 0;
            
            
            if(cantidadHabitacionesG <= 3){
                System.out.println("Has sobrepasado el limite de habitaciones"); 
            }
            else{
                System.out.println("Felicidades");
                contadorG += cantidadHabitacionesG;
                System.out.println("El costo es de: "+(cantidadHabitacionesG*350));
            } 
        }          
        
        if(opcionH == 5){
            System.out.println("Cuantas habitaciones desea: ");
            
            int cantidadHabitacionesSL = sc.nextInt();
            int contadorSL = 0;
            
            
            if(cantidadHabitacionesSL <= 3){
                System.out.println("Has sobrepasado el limite de habitaciones"); 
            }
            else{
                System.out.println("Felicidades");
                contadorSL += cantidadHabitacionesSL;
                System.out.println("El costo es de: "+(cantidadHabitacionesSL*550));
            } 
        }          
    }
    
    public void datosUsuario(){
        System.out.println("Indique su nombre");
        String nombre = sc.nextLine();
        System.out.println("Indique su apellido");
        String apellido = sc.nextLine();
        System.out.println("Indique su pasaporte");
        int pasaporte = sc.nextInt();
    }
    
    
    public void confirmacion(){
        
        System.out.println("Indique si quiere confirmar(no/si");
        String confirmacion = sc.nextLine();
        
        if(confirmacion.equals("no"))menu();
        
        else{
            sc.close();
            System.exit(0); 
        }
    }  
}
    

