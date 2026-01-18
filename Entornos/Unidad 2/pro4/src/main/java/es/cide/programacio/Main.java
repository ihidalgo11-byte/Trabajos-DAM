package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        boolean rep = true;
        boolean insertado = false;
        while (sc.hasNextInt()) {
            int s = sc.nextInt();
            if (p > s) {
                System.out.print(s + " ");
            }
            if (p <= s) {
                if (rep) {
                    System.out.print(p + " ");
                    rep = false;
                    insertado = true;
                }
                System.out.print(s + " ");
            }
        }
        if (!insertado) {
                System.out.print(p);
            }
        sc.close();
    }
}