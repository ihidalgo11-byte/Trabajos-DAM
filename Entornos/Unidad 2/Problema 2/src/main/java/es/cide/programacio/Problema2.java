package es.cide.programacio;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int n = sc.nextInt();
        boolean igual = false;
        while (n > 0) {
            if (n % 10 == d) {
                igual = true;
                n = 0;
            }
            n = n / 10;
        }
        if (igual == true) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}