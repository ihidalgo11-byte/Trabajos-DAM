package es.cide.programacio;

import java.util.Scanner;

public class Problema7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(comptar8(n));
    }
    public static int comptar8 (int n) {
        if (n == 0) {
            return 0;
        }
        if (n%10 == 8 && (n/10)%10 == 8) {
            return comptar8(n/10)+2;
        } else if (n%10 == 8) {
            return comptar8(n/10)+1;
        } else return comptar8(n/10);
        
    }
}