package ejercicio1;

import java.util.Scanner;

public class Metodo {
    
    Scanner sc = new Scanner(System.in);
    
    double cuentaBancaria = 2000;
    double depositado;
    double valorRetirar;
    double valorTransferir; 
    double valorRestante; 
    
    public void depositar() {
        System.out.println("Ingrese el valor a depositar");
        depositado = sc.nextDouble();
        System.out.println("Usted a depositado: "+depositado);
        valorRestante = cuentaBancaria-depositado;
        System.out.println("El valor restante es de: "+valorRestante);
        
    }

    public void retirar() {
        System.out.println("Cuanto desea retirar: ");
        valorRetirar = sc.nextDouble();
            
            if (valorRetirar <= cuentaBancaria) {
                System.out.println("Usted a retirado" + valorRetirar);
                valorRestante = cuentaBancaria - valorRetirar;
                System.out.println("El valor restante es de: " + valorRestante);
            } else {
                System.out.println("Has colocado un valor superior");
            }
    }

    public void ver() {
        System.out.println("Usted tiene: "+cuentaBancaria);
    }

    public void transferirDinero() {
        System.out.println("Cuanto desea transferir");
        valorTransferir = sc.nextDouble();
        System.out.println("El valor a sido transferido");
        valorRestante = cuentaBancaria-valorTransferir;
        System.out.println("El valor restante es de: "+valorRestante);
    }                   
}
