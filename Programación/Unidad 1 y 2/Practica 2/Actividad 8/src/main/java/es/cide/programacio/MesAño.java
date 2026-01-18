package es.cide.programacio;

import java.util.Scanner;

public class MesAño {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero del 1 al 12: ");
        int Num = sc.nextInt();

        switch (Num) {
            case 1:
                System.out.print("Enero");
                break;
            case 2:
                System.out.print("Febrero");
                break;
            case 3:
                System.out.print("Marzo");
                break;
            case 4:
                System.out.print("Abril");
                break;
            case 5:
                System.out.print("Mayo");
                break;
            case 6:
                System.out.print("Junio");
                break;
            case 7:
                System.out.print("Julio");
                break;
            case 8:
                System.out.print("Agosto");
                break;
            case 9:
                System.out.print("Septiembre");
                break;
            case 10:
                System.out.print("Octubre");
                break;
            case 11:
                System.out.print("Noviembre");
                break;
            case 12:
                System.out.print("Diciembre");
                break;
            default: 
                System.out.print("Mes no valido");
                break;
        }
    }
}