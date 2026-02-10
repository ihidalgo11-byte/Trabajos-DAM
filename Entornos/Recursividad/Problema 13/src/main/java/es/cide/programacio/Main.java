package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(petit(x));
    }
    public static int min(int a, int b) {
        if (a<b) {
            return a;
        } else return b;
    }
    public static int petit(int x) {
        if (x<10) {
            return x;
        }
        return petit(x/10)*10 + min(petit(x/10)%10, x%10);
    }
}