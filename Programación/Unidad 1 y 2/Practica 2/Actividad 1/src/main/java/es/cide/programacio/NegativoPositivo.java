package es.cide.programacio;

import java.util.Scanner;

public class NegativoPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedir numero al usuario
        System.out.print("Introduce un numero: ");
        int Num = sc.nextInt();

        //Comprobar si es negativo o positivo
        if (Num >= 0){
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
        sc.close();
    }
}