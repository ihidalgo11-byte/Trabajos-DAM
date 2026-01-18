package es.cide.programacio;

import java.util.Scanner;
public class Problema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int numero = sc.nextInt();
        int contador = 0;
        if (numero == 0) {
            contador++;
        }
        while (numero>=1) {
           numero = numero/10;
           contador++;
        }
        System.out.println("El numero indicado tiene "+contador+" digito o digitos");
        sc.close();
    }
}