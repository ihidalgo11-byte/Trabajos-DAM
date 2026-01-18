package es.cide.programacio;

import java.util.Scanner;
public class Problema8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una seqüencia de caracteres 'n', 's', 'e', o 'w'");
        String caracteres = sc.nextLine();
        int x = 0;
        int y = 0;
        int contador = 0;
        int bucle = 0;
        while (bucle == 0) {
            if (caracteres.charAt(contador) == 'e') {
                x++;
            } else if (caracteres.charAt(contador) == 'w') {
                x--;
            } else if (caracteres.charAt(contador) == 's') {
                y++;
            } else if (caracteres.charAt(contador) == 'n') {
                y--;
            } else if (caracteres.charAt(contador) == '.') {
                bucle++;
            }
            contador++;
        }
        System.out.println("x,y = "+x+","+y);
        sc.close();
    }
}