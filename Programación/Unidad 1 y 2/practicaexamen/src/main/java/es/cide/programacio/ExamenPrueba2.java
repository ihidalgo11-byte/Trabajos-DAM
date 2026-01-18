package es.cide.programacio;

import java.util.Random;
import java.util.Scanner;
public class ExamenPrueba2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);
        int[] numeroEnteros = new int[10];
        double media = 0;
        int pares = 0;
        int impares = 0;
        int max, min;
        System.out.println("Introduce 10 numeros enteros: ");
        for (int i = 0; i < 10; i++) {
            numeroEnteros[i] = sc.nextInt();
            media = numeroEnteros[i] + media; 
            if (numeroEnteros[i]%2 == 0) {
                pares++;
            } else {
                impares++;
            } 
        }
        max = numeroEnteros[0];
        min = numeroEnteros[0];
        for (int i2 = 0; i2 < 10; i2++) {
            if (numeroEnteros[i2] < min) {
                min = numeroEnteros[i2];
            }
            if (numeroEnteros[i2] > max) {
                max = numeroEnteros[i2];
            }
        }
        System.out.println(media/10);
        System.out.println("El minimo es "+min+" y el maximo "+max);
        System.out.println(+pares+" numeros pares y " +impares+" numeros impares");
    }
}