package es.cide.programacio;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursivo(n));
    }
    public static int recursivo(int n) {
        if (n <= 9) {
            return 1;
        }
        return recursivo(n/10)+1;
    }
}