package es.cide.programacio;

import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el valor de a: ");
        int a = sc.nextInt();
        System.out.print("Introduce el valor de b: ");
        int b = sc.nextInt();

        System.out.print("Introduce alguno de estos operadores + - * /: ");
        char operador = sc.next().charAt(0);

        switch (operador) {
            case '+':
                    System.out.print(a + b);
                break;
            case '-':
                    System.out.print(a - b);
                break;
            case '*':
                    System.out.print(a * b);
                break;
            case '/':
                    System.out.print(a / b);
                break;
            default:
                break;
        }
    }
}