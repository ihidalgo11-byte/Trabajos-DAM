package es.cide.programacio;

import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Pide el numero al usuario
        System.out.println("Escribe un numero:");
        int num = sc.nextInt();
        //Comprueba si es par o impar
        if (num%2 == 0) {
            System.out.println("El número es par");
        }   else {
            System.out.println("El número es impar");
        }
    }
}