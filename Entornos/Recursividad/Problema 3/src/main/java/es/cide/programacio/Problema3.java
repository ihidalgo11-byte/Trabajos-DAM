package es.cide.programacio;

import java.util.Scanner;
public class Problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isIncreasing(n)) {
            System.out.println("SI");
        } else System.out.println("NO");
    }
    public static boolean isIncreasing(int n) {
        if (n < 10) {
            return true;
        }
        if (n%10 < ((n/10)%10)) {
            return false;
        }
        return isIncreasing((n/10));
    }
}