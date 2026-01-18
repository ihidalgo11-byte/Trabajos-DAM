package es.cide.programacio;

import java.util.Scanner;
public class Problema6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero = sc.nextInt();
        for (int i = 0; i<numero; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}