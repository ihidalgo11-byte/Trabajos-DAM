package es.cide.programacio;

import java.util.Scanner;
public class practica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
        while (!i.equals("f")) {
            int a = Integer.parseInt(i);
            int b = sc.nextInt();
            System.out.println(a+b);
            i = sc.next();
        }
    }
}