package es.cide.programacio;

import java.util.Scanner;
public class Problema2 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int a, b;
        while (i < 1){
            System.out.println("Introduce la operación sumar, restar, invertir o parar:");
            String operacion = sc.next();
            if (operacion.equals("sumar")){
                System.out.println("Introduce el numero real A:");
                a = sc.nextInt();
                System.out.println("Introduce el numero real B:");
                b = sc.nextInt();
                System.out.println(a + b);                
            }
            if (operacion.equals("restar")){
                System.out.println("Introduce el numero real A:");
                a = sc.nextInt();
                System.out.println("Introduce el numero real B:");
                b = sc.nextInt();
                System.out.println(a - b);
            }
            if (operacion.equals("invertir")) {
                System.out.println("Introduce el numero real A:");
                a = sc.nextInt();
                System.out.println(a * -1);          
            }
            if (operacion.equals("parar")) {
                i++;
                System.out.println("Calcualdora detenida");
            }            
        }
        sc.close();
    }
}