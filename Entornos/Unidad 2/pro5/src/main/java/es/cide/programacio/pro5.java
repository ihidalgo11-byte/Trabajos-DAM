package es.cide.programacio;

import java.util.Scanner;
public class pro5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.next();
        int contador = 0;
        int max = 0;
        boolean bucle = false;
        while (!bucle) {
            String secuencia = sc.next();
            if (secuencia.equals(".")) {
                bucle = true;
            }
            if (secuencia.equals(palabra)) {
                contador++;
            } else {
                contador = 0;
            }
            if (contador > max) {
                max = contador;
            }
        }
        System.out.println(max);
    }
}