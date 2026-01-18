package es.cide.programacio;

import java.util.Scanner;
public class AdivinaLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una letra: ");
        char letra = sc.next().charAt(0);

        switch (letra) {
            case 'a':
                System.out.print("Es una vocal");
                break;
            case 'e':
                System.out.print("Es una vocal");
                break;
            case 'i':
                System.out.print("Es una vocal");
                break;
            case 'o':
                System.out.print("Es una vocal");
                break;
            case 'u':
                System.out.print("Es una vocal");
                break;
            default: 
                System.out.print("Es una consonante");
                break;
        }
    }
}