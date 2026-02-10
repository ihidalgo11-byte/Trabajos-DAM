package es.cide.programacio;

import java.util.Scanner;

public class Problema9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(countD(s));
    }
    public static int countD(String s) {
        if (s.length() == 0) { //Si la longitud del string s es 0 devuelve 0
            return 0;
        }
        if (s.charAt(0) == 'd') { //Si el primer caracter de s es 'd' devuelve el metodo con un string sin el primer caracter y suma 1
            return countD(s.substring(1)) + 1;
        } else return countD(s.substring(1)); //Devuelve el metodo con un string sin el primer caracter
    }
}