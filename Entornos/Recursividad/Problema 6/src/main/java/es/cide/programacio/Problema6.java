package es.cide.programacio;

import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(comptar7(n));
    }
    public static int comptar7 (int n) {
        if (n == 0) {
            return 0;
        }
        if (n%10 == 7) {
            return comptar7(n/10)+1;
        } else return comptar7(n/10);
    }
}