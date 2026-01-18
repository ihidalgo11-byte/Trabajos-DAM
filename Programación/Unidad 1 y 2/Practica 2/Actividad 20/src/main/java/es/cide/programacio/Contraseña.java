package es.cide.programacio;

import java.util.Scanner;
public class Contraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la contraseña: ");
        String clave = sc.nextLine();

        if (clave.equals("java123")) {
            System.out.print("Acceso permitido");
        }   else {
            System.out.print("Acceso denegado");
        }
        sc.close();
    }
}