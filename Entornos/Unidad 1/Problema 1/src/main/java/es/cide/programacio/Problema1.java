package es.cide.programacio;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la primera palabra: ");
        String a = sc.next();
        System.out.print("Introduce la segunda palabra: ");
        String b = sc.next();

        if (a.compareTo(b)>0){
            System.out.println(a + " < " + b);
        }
        else if (a.compareTo(b)<0){
            System.out.println(a + " > " + b);
        }
        else System.out.println(a + " = " + b);

    }
}