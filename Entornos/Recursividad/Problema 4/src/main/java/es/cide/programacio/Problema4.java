package es.cide.programacio;

import java.util.Scanner;
public class Problema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
    public static boolean isPrime(int n) {
        if (n) {
            
        }
    }
    public static int suma(int n) {
        if (n < 10) {
            return n;
        }
        return suma((n/10)+(n%10));
    }
    public static boolean isPerfectPrime(int n) {
        if (!isPrime(n)) {
            return false;
        }
        return true;
    }

    
    
    
    
}