package es.cide.programacio;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int i = 0;
        boolean bucle = false;
        String secuencia = sc.next();
        while (!bucle) {
            char s = secuencia.charAt(i); 
            if (s == ('.')) {
                bucle = true;
            }
            if (s == ('(')) {
                contador++;
            } else if (s == (')')) {
                contador--;
            }
            i++;
        }
        if (contador == 0) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}