package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;
        int numero = sc.nextInt();
        while (!encontrado && numero != 0) {
            if (numero % 2 == 0) {
                encontrado = true;
            }
            numero = sc.nextInt();
        }
        if (encontrado == true) {
            System.out.println("SI");
        } else {System.out.println("NO");}
        sc.close();
    }
}