package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(cambiarX(s));
    }
    public static String cambiarX(String s) {
        if (s.length() == 0) {
            return s;
        }
        if (s.charAt(0) == 'x') {
            return cambiarX(s.substring(1)) + 'y';
        } else return s.charAt(0) + cambiarX(s.substring(1));
    }
}