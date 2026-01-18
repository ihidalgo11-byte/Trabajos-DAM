package es.cide.programacio;

import java.util.Scanner;
public class Problema7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine();
        System.out.println("Introduce otra palabra: ");
        String palabra2 = sc.nextLine();
        int contador = 0;
        int contadorA = 0;
        int i = 0;
        while (i == 0) {
            if (palabra.charAt(contador) == 'a') {
                contadorA++;
            } else if (palabra.charAt(contador) == '.') {
                i++;
            }
            if (palabra2.charAt(contador) == 'a') {
                contadorA++;
            } else if (palabra2.charAt(contador) == '.') {
                i++;
            }
            contador++;
        }
        System.out.println("Cantidad de letras A: "+contadorA);
        sc.close();
    }
}