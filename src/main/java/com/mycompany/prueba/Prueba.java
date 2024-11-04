package com.mycompany.prueba;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {

        double valor1 = 0;
        double valor2 = 0;
        double operacion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("****BIENVENIDOS*****");

        System.out.println("Escriba el valor 1");
        valor1 = teclado.nextDouble();
        System.out.println("Escriba el valor 2");
        valor2 = teclado.nextDouble();
        System.out.println("SELECCIONE EL NUMERO DE ACUERDO A LA OPERACION QUE REALIZARAS");

        System.out.println("1 para suma, 2 para resta, 3 para multiplicacion y 4 para division");

        operacion = teclado.nextInt();
        if (operacion == 1) {
            operacion = (valor1 + valor2);
            System.out.println("El resultado de la suma es: " + operacion);
        } else {
            if (operacion == 2) {
                operacion = (valor1 - valor2);
                System.out.println("El resultado de la resta es: " + operacion);
            } else {
                if (operacion == 3) {
                    operacion = (valor1 * valor2);
                    System.out.println("El resultado de la multiplicacion es: " + operacion);
                } else {
                    if (operacion == 4) {
                        operacion = (valor1 / valor2);
                        System.out.println("El resultado de la division es: " + operacion);
                    } else {
                        System.out.println("El numero de operacion es invalido");

                    }
                }

            }

        }

        
        

        
    
    
    
    } 
    //else {
           // System.out.println("El numero de operacion no es valido");

        
        
        
      
    }

