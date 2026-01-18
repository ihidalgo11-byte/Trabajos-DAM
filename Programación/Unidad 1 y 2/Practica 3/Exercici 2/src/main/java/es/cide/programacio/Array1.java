package es.cide.programacio;

import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = {11,11,11,11,11,11};
        int i = 0;
        int aprobados = 0;
        int suspendidos = 0;
        while (i<6) {
            System.out.println("Introduce la nota de un alumno:");
            notas[i] = sc.nextInt();
            i++;}
        i = 0;
        while (i<6) {
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspendidos++;
            }
            i++;
        }
        System.out.println("Aprobados "+aprobados);
        System.out.println("Suspendidos "+suspendidos);
        sc.close();
        }
}