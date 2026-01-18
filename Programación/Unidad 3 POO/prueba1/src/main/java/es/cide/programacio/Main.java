package es.cide.programacio;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige 1.Sumar 2.Restar 3.Multiplicar 4.Dividir");
        int menu = sc.nextInt();
        System.out.println("Indica el primer numero: ");
        double valor1 = sc.nextDouble();
        System.out.println("Indica el segundo numero: ");
        double valor2 = sc.nextDouble();
        Calculadora miCasio = new Calculadora(valor1, valor2);
        double resultado;
        switch (menu) {
            case 1:
                resultado = miCasio.sumar();
                System.out.println(resultado);
                break;
            case 2:
                resultado = miCasio.restar();
                System.out.println(resultado);
                break;
            case 3:
                resultado = miCasio.multiplicar();
                System.out.println(resultado);
                break;
            case 4:
                resultado = miCasio.dividir();
                System.out.println(resultado);
                break;
        }
    }
}