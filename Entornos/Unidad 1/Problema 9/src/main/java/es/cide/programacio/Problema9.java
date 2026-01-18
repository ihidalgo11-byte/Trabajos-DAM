package es.cide.programacio;

import java.util.Scanner;
public class Problema9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la cantidad de areas que quieres calcular: ");
        int entero = sc.nextInt();
        int alturaR, anchuraR, radioCirculo;
        String descripcion;
        for (int i = 0; i <entero; i++) {
            System.out.println("Indica rectangulo o circulo: ");
            descripcion = sc.next();
            if (descripcion.equals("rectangulo")) {
                System.out.println("Indica la altura del rectangulo: ");
                alturaR = sc.nextInt();
                System.out.println("Indica la anchura del rectangulo: ");
                anchuraR = sc.nextInt();
                System.out.println(alturaR*anchuraR);
            } else if (descripcion.equals("circulo")) {
                System.out.println("Indica el radio del circulo: ");
                radioCirculo = sc.nextInt();
                System.out.println(3.14*(radioCirculo*radioCirculo));
            }
        }
        sc.close();
    }
}