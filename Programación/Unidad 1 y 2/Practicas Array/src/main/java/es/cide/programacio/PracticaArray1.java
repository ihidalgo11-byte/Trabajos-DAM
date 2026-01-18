package es.cide.programacio;

import java.util.Scanner;
public class PracticaArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {9,9,9,9,9,9,9,9};
        int i = 0;
        int num1;
        while (i < 8) {    
            System.out.print("Introduce el valor de un numero entero: ");
            numeros[i] = sc.nextInt();
            i++;
        }
        System.out.println("Introduce otro numero: ");
        num1 = sc.nextInt();
        i = 0;
        while (i < 8) {
            if (numeros[i] == num1) {
                System.out.println("El numero "+num1+" si esta dentro del array");
            } else {
                System.out.println("El numero no esta en el array");
            }
            i++;
        }
        sc.close();
    }
}