package es.cide.programacio;

//DNI: 45611014j
//Nom: Iván Hidalgo Montalvo
import java.util.Scanner;

public class Heroi {
    Scanner sc = new Scanner(System.in);
    // Atributos
    private String nom;
    private int vida;
    private boolean vivo;
    private String respuestas[];

    // Constructor
    public Heroi(String nomHeroi, String respuestas[]) {
        this.nom = nomHeroi;
        this.vida = 10; // Cantidad vida
        this.respuestas = respuestas; // Iguala al array de respuestas del main
        this.vivo = true;

    }

    // Getters y Setters
    public boolean getVivo() { // Devuelve si el heroe esta vivo o no
        return this.vivo;
    }

    public int getVida() { // Devuelve la cantidad de vida del heroe en ese momento
        return this.vida;
    }

    // Metodos
    public String defensar() { // Enseña todas las respuetas, solicita un numero y devuelve el array de
                               // respuestas con la posicion indicada
        for (int i = 0; i < respuestas.length; i++) {
            System.out.println(this.respuestas[i]);
        }
        System.out.println("Elige la contestación correcta (1-9):");
        int respuestaUser = sc.nextInt();
        return this.respuestas[respuestaUser - 1];
    }

    public boolean vida() { // Resta vida al heroe si falla la contestación
        this.vida--;
        if (this.vida == 0) { // Si la vida llega a 0 el heroe muere
            this.vivo = false;
            System.out.println("Has muerto!");
        } else {
            System.out.println("Al heroe le queda " + vida + " de vida restante.");
        }
        return this.vivo;
    }
}