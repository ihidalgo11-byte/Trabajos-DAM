package es.cide.programacio;

import java.util.Scanner;
public class Problema10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de a: ");
        int valorA = sc.nextInt();
        System.out.println("Introduce el valor de b: ");
        int valorB = sc.nextInt();
        if (valorA <= valorB) {
            while (valorA <= valorB) {
                if (valorA == valorB) {
                    System.out.println(valorA+".");
                    valorA++;
                } else
                System.out.print(valorA+", ");
                valorA++;
            }
        } else if (valorA == valorB) {
            System.out.println(valorA);
        }
        sc.close();
    }
}