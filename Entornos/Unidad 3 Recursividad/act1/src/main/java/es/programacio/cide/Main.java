package es.programacio.cide;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Metodo metodo = new Metodo();
        int num = sc.nextInt();
        System.out.println(metodo.fibonacci(num));
        

    }
}