package es.cide.programacio;

import java.util.Scanner;
public class while1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Solicita al usuario un numero
        System.out.println("Escribe un numero entero positivo");
        int num = sc.nextInt();
        int numPar = 0;
        int res = 0;
        while (numPar<=num) {
            numPar++;
            if (numPar % 2 == 0) {   
                res = numPar + res;
            }  
        }
        System.out.println(res);
    }
}