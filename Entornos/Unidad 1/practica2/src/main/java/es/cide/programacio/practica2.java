package es.cide.programacio;

import java.util.Scanner;
public class practica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        String bucle = sc.next();
        while (!bucle.equals("*")) {
            int numeros = Integer.parseInt(bucle);
            if (numeros%10 == 0) {
                System.out.println("El numero es multiple de 10");
            } else {
                System.out.println("El numero no es multiple de 10");
            }
            System.out.println("Pon otro numero: ");
            bucle = sc.next();
        }

    }
}