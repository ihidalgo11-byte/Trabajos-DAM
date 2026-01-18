package es.cide.programacio;

//DNI: 45611014j
//Nom: Iván Hidalgo Montalvo
import java.util.Scanner;

public abstract class Heroi extends Personatge implements Fight, Speak {
    Scanner sc = new Scanner(System.in);
    // Atributos
    protected boolean vivo;
    protected String respuestas[];
    protected String res2;

    // Constructor
    public Heroi(String respuestas[], String nom, int vida) {
        super(nom, vida);
        this.respuestas = respuestas; // Iguala al array de respuestas del main
    }

    // Getters y Setters
    public boolean getVivo() { // Devuelve si el heroe esta vivo o no
        return this.vivo;
    }

    public int getVida() { // Devuelve la cantidad de vida del heroe en ese momento
        return this.vida;
    }
    
    public String getNombre() {
        return this.nom;
    }

    public String getRes() { //Getter de la respuesta guardada en los heroes
        return res2;
    }

    // Metodos
    public void insultar(){}
    public abstract void defensar();
    public abstract boolean vida();
    public abstract void sayHello();
    public abstract void sayGoodBye();
}