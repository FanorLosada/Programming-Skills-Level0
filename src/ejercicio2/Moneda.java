package ejercicio2;

import java.awt.Menu;
import java.util.Scanner;

public class Moneda {

    Scanner sc = new Scanner(System.in);

    int opcionMonedaI;
    int opcionMonedaC;
    
    public static double valor; 
    public static double valorIngresado; 
    
    public static double fondo = 200000;
    public static int decision;    
    
    
    public void menuMoneda() {

        do {

            System.out.println("CONVERTIDOR DE MONEDA");
            System.out.println("Indique la moneda inicial");
            System.out.println("1. CLP");
            System.out.println("2. ARS");
            System.out.println("3. USD");
            System.out.println("4. EUR");
            System.out.println("5. TRY");
            System.out.println("6. GBP");
            System.out.println("7. Salir");

            opcionMonedaI = sc.nextInt();

            if (opcionMonedaI == 7) {
                break;
            }
            if (1 > opcionMonedaI || 7 < opcionMonedaI) {
                System.out.println("Has ingresado valor invalido");
                menuMoneda();
            }

            System.out.println("Indique la moneda de cambio");
            System.out.println("1. CLP");
            System.out.println("2. ARS");
            System.out.println("3. USD");
            System.out.println("4. EUR");
            System.out.println("5. TRY");
            System.out.println("6. GBP");
            System.out.println("7. Salir");

            opcionMonedaC = sc.nextInt();

            if (opcionMonedaC == 7) {
                break;
            }
            if (1 > opcionMonedaC || 7 < opcionMonedaC) {
                System.out.println("Has ingresado valor invalido");
                menuMoneda();
            }

            System.out.println("Ingrese el valor a cambiar");
            valorIngresado = sc.nextDouble();

            convertidorMoneda();
        } while (opcionMonedaI != 7 || opcionMonedaC != 7);
    }

    public void convertidorMoneda() {
                
        switch (opcionMonedaI) {
            case 1:
                if (opcionMonedaC == 2) {;
                    valor = valorIngresado * 0.916;
                    break;
                } else if (opcionMonedaC == 3) {
                    valor = valorIngresado * 0.0011;
                    break;
                } else if (opcionMonedaC == 4) {
                    valor = valorIngresado * 0.0010;
                    break;
                } else if (opcionMonedaC == 5) {
                    valor = valorIngresado * 0.034;
                    break;
                } else if (opcionMonedaC == 6) {
                    valor = valorIngresado * 0.00089;
                    break;
                }
            case 2:
                if (opcionMonedaC == 1) {
                    valor = valorIngresado * 1.09;
                    break;
                } else if (opcionMonedaC == 3) {
                    valor = valorIngresado * 0.0012;
                    break;
                } else if (opcionMonedaC == 4) {
                    valor = valorIngresado * 0.0011;
                    break;
                } else if (opcionMonedaC == 5) {
                    valor = valorIngresado * 0.037;
                    break;
                } else if (opcionMonedaC == 6) {
                    valor = valorIngresado * 0.00097;
                    break;
                }

            case 3:
                if (opcionMonedaC == 1) {
                    valor = valorIngresado * 887.48;
                    break;
                } else if (opcionMonedaC == 2) {
                    valor = valorIngresado * 811;
                    break;
                } else if (opcionMonedaC == 4) {
                    valor = valorIngresado * 0.914;
                    break;
                } else if (opcionMonedaC == 5) {
                    valor = valorIngresado * 30;
                    break;
                } else if (opcionMonedaC == 6) {
                    valor = valorIngresado * 0.79;
                    break;
                }

            case 4:
                if (opcionMonedaC == 1) {
                    valor = valorIngresado * 996;
                    break;
                } else if (opcionMonedaC == 2) {
                    valor = valorIngresado * 886;
                    break;
                } else if (opcionMonedaC == 3) {
                    valor = valorIngresado * 1;
                    break;
                } else if (opcionMonedaC == 5) {
                    valor = valorIngresado * 33;
                    break;
                } else if (opcionMonedaC == 6) {
                    valor = valorIngresado * 0.026;
                    break;
                }

            case 5:
                if (opcionMonedaC == 1) {
                    valor = valorIngresado * 30;
                    break;
                } else if (opcionMonedaC == 2) {
                    valor = valorIngresado * 27;
                    break;
                } else if (opcionMonedaC == 3) {
                    valor = valorIngresado * 0.033;
                    break;
                } else if (opcionMonedaC == 4) {
                    valor = valorIngresado * 0.030;
                    break;
                } else if (opcionMonedaC == 6) {
                    valor = valorIngresado * 0.026;
                    break;
                }

            case 6:
                if (opcionMonedaC == 1) {
                    valor = valorIngresado * 1.116;
                    break;
                } else if (opcionMonedaC == 2) {
                    valor = valorIngresado * 1.023;
                    break;
                } else if (opcionMonedaC == 3) {
                    valor = valorIngresado * 1;
                    break;
                } else if (opcionMonedaC == 4) {
                    valor = valorIngresado * 1;
                    break;
                } else if (opcionMonedaC == 5) {
                    valor = valorIngresado * 38;
                    break;
                }       
        }
        resultadoMoneda();
    }
    
    public void resultadoMoneda(){
        
        Fondo fo = new Fondo();
        System.out.println("El valor del cambio es: "+valor); 
        RetirarFondo();
    }
    
    
    public void RetirarFondo() {

        System.out.println("Indique si quiere retirar su fondo,(1. Si, 2. No)");
        decision = sc.nextInt();
        
        int salir;

        if (decision == 1) {
            System.out.println("Usted a seleccionado retirar");
                       
            switch(opcionMonedaI){
                //CLP
                case 1:
                    if(valor<200 || valor>100000){
                       System.out.println("Este valor no puede ser posible");
                       break;                        
                    } 
                    else{
                        operacionComision();
                        break;
                    }   
                //ARS    
                case 2:
                    if (valor< 500 || valor> 130000) {
                        System.out.println("Este valor no puede ser posible");
                        break;
                    } else {
                        operacionComision();
                        break;
                    }
                //USD 
                case 3:
                    if(valor<350 || valor>170000){
                        System.out.println("Este valor no puede ser posible");
                        break;
                    }      
                    else{
                       operacionComision();
                       break;
                    }
                //EUR          
                case 4:  
                    if(valor<400 || valor>160000){
                        System.out.println("Este valor no puede ser posible");
                        break;
                    }                        
                    else{
                        operacionComision();
                        break;
                    }
                //TRY                         
                case 5:
                    if(valor<240 || valor>100000){
                        System.out.println("Este valor no puede ser posible");
                        break;
                    } 
                       
                    else{
                        operacionComision(); 
                        break;
                    }
                                         
                case 6:
                //GBP   
                    double montoMi = 400, montoMa = 110000;
                    if(montoMi<400 || montoMa>110000){
                        System.out.println("Este valor no puede ser posible");
                        break;
                    }   
                    else{
                        operacionComision();
                        break;
                    }           
            }
        } else if (decision == 2) {
                        
            System.out.println("Usted ha seleccionado no retirar");

            System.out.println("Desea salir");
            System.out.println("1. Si");
            System.out.println("2. No");

            salir = sc.nextInt();

            if (salir == 1) {
                System.out.println("Gracias por usar el programa");
                sc.close();
                System.exit(0);
            }
            else{
                menuMoneda();
            }
        }
    }
    
    public void operacionComision(){
            double comision = valor * 0.01;
            double valorNeto = valor - comision;
            System.out.println("Se aplico la comision de 1%: " + valorNeto);        
    }
    
    
}