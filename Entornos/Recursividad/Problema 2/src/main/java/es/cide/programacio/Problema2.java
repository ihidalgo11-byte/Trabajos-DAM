package es.cide.programacio;

import java.util.Scanner;
public class Problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reduction_of_digits(n));
    }
    public static int reduction_of_digits(int n) {
        if (n <= 9) {
            return n;
        }
        return reduction_of_digits((n/10)+(n%10));
    }
}