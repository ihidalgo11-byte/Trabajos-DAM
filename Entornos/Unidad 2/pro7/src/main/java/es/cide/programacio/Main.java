package es.cide.programacio;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        int suma = 0;
        while (sc.hasNextInt()) {
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                suma = + numero;
            } else {
                suma = suma - numero;
            }
        }
        System.out.println(suma);
    }
}