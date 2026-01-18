package es.cide.programacio;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        int suma = 0;
        while (sc.hasNextInt()) {
            int numero = sc.nextInt();
            if (numero % 3 == 0) {
                suma += numero;
            }
            if (numero % 5 == 0) {
                suma -= numero;
            }
        }
        System.out.println(suma);
    }
}