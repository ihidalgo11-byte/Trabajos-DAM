package es.cide.programacio;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipusObstacles[] = {"Pedra", "Forat", "Mur", "Barranc", "Rampa"};
        System.out.println("Indica el nombre del robot: ");

        Robot r = new Robot(sc.next(), 60, 5);

        for (int i = 0; i < tipusObstacles.length; i++) {
            Obstacle o = new Obstacle(tipusObstacles[i]);
            o.toString();
            if (!r.superarObstaculo(o)) {
                System.out.println("El robot "+r.getNom()+" no ha superado el obstaculo "+tipusObstacles[i]);
                System.out.println(" ");
                i = tipusObstacles.length;
            } else {
                System.out.println("El robot "+r.getNom()+" ha superado el obstaculo "+tipusObstacles[i]);
                System.out.println(" ");
                System.out.println(r.getEnergia()+" de energia restante");
                System.out.println(" ");
            }
        }
        if (r.getEnergia() > 0) {
            System.out.println("El robot ha superat tots els obstacles!");
        } else {
            System.out.println("El robot no ha aconseguit superar la prova.");
        }



    }
}