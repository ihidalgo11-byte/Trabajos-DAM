package es.cide.programacio;

import java.util.Scanner;
public class Problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de x");
        int x = sc.nextInt();
        System.out.println("Introduce el valor de y");
        int y = sc.nextInt();
        int res = 0;
        int i = 0;
        while (i < y) {
            res = x + res;
            i++;
        }
        System.out.println("Resultado = "+res);


    }
}