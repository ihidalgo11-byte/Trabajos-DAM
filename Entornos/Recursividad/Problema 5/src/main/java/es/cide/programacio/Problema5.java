package es.cide.programacio;

import java.util.Scanner;
public class Problema5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(orellesConills(n));
    }
    public static int orellesConills(int n) {
        if(n == 0) { //Cero conejos igual cero orejas
            return 0;
        }
        if (n%2 == 0) { //Si la cantidad de conejos es par devuelve el metodo con un conejo menos y suma 3 orejas
            return orellesConills(n-1)+3;
        } else return orellesConills(n-1)+2; //Si la cantidad de conejos es impar devuelve el metodo con un conejo menos y suma 2 orejas
        
    }
}