package es.cide.programacio;

import java.util.Currency;
import java.util.Scanner;

public class Problema11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int centimos = sc.nextInt();
        int q = 0;
        int p = 0;
        for (p = 0; p < centimos / 7; p++) {
            int remaning = centimos - 7 * p;
            if (remaning % 4 == 0) {
                q = remaning / 4;
            }
        }
        System.out.println(p + " sellos de siete y " + q + " de cuatro");

    }
}