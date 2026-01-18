package es.cide.programacio;

import java.util.Random;
import java.util.Scanner;
public class ExamenPrueba {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        int adivina;
        int numeroAleatorio = aleatorio.nextInt(51);
        while (numeroAleatorio == 0) {
            numeroAleatorio = aleatorio.nextInt(51);
        }
        System.out.println("Intenta adivinar el numero aleatorio entre 1 y 50: ");
        while (intentos < 6) {
            adivina = sc.nextInt();
            if (adivina == numeroAleatorio) {
                System.out.println("Numero adivinado!");
                intentos = intentos + 6;
            } else if (adivina < numeroAleatorio) {
                System.out.println("El numero es más grande que el introducido");
            } else if (adivina > numeroAleatorio) {
                System.out.println("El numero es más pequeño que el introducido");
            }
            intentos++;
        } 
    }
}