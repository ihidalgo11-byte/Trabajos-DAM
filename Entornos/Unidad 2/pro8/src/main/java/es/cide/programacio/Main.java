package es.cide.programacio;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secuencia = sc.nextInt();
        boolean salir = false;
        boolean eraPar;
            if (secuencia % 2 == 0) {
                eraPar = true;
            } else {
                eraPar = false;
            }
            while (sc.hasNextInt() && !salir) {
                secuencia = sc.nextInt();
                if (eraPar && secuencia % 2 == 0 || !eraPar && secuencia % 2 != 0) {
                    salir = true;
                } 
                eraPar = secuencia % 2 == 0;
            }
            if (salir) {
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }
            
    }
}