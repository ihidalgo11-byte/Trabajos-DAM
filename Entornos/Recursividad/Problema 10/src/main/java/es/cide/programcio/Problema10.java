package es.cide.programcio;

import java.util.Scanner;

public class Problema10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(contadorSi(s));
    }
    public static int contadorSi(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) == 's' && s.charAt(1) == 'i') {
            return contadorSi(s.substring(1)) + 1;
        } else return contadorSi(s.substring(1));
    }
}