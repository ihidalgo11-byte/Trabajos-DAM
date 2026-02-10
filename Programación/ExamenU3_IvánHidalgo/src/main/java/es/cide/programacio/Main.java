package es.cide.programacio;
//Nom: Iván Hidalgo Montalvo
//DNI: 45611014j
//Fecha: 2/12/2025
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int aleatorio = random.nextInt(3)+5; //Aleatorio entre 5 y 7 para el tamaño del array
        Obstacle[] arrayObstacles = new Obstacle[aleatorio]; //Array de obstaculos de tamaño entre 5 y 7
        System.out.println("Ponle nombre al pony: ");
        Pony p = new Pony(sc.next(), 15); //Objeto pony
        System.out.println("El pony tiene 15 de energia.");

        for (int i = 0; i < aleatorio; i++) { //Bucle dependiendo de la cantidad de obstaculos
            Obstacle o = new Obstacle();
            arrayObstacles[i] = o; //Guarda el objeto generado en la posicion indicada
            System.out.println("El obstaculo " +o.getTipo()+ "tiene una dificultat de: " +o.getDificultat());
            if (p.superarObstacle(arrayObstacles[i])) { //Si supera el obstaculo muetra mensaje de felicitacion y la energia restante
                System.out.println("Obstaculo superado!");
                System.out.println("Energia restante: "+p.getEnergia());
                System.out.println("");
            } else {
                i = aleatorio; //Si el pony no supera el obstaculo sale del bucle
            }
        }
        if (p.getEnergia() > 0) { //Si la energia es superior a 0 muestra mensaje positivo
            System.out.println("El pony ha superat tots els obstacles, el pots dur a competir!");
        } else { //Si la energia es menor a 0 muestra mensaje negativo
            System.out.println("El pony no ha superat tots els obstacles");
        }
    }
}