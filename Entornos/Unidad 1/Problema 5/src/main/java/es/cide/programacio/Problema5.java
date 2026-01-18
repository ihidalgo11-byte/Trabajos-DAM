package es.cide.programacio;

import java.util.Scanner;
public class Problema5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        int i = 1;
        int contador = 0;
        while (numero >= i) {
            if (numero % i == 0)  {
                contador++;
            }  
            i++;
        }
        if (contador >= 3) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
            }
        sc.close();
    }
}