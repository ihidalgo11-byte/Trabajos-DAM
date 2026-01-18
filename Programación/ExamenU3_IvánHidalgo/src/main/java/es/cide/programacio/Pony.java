package es.cide.programacio;
//Nom: Iván Hidalgo Montalvo
//DNI: 45611014j
//Fecha: 2/12/202
import java.util.Random;
public class Pony {
    Random random = new Random();
    private String nom;
    private int energia;
    private int força;

    public Pony(String nom, int energia) { //Contructor pony
        this.nom = nom;
        this.energia = energia;
        this.força = random.nextInt(5)+1; //Aleatorio entre 1 y 5
    }

    public int getEnergia() { //Devuelve la energia
        return energia;
    }

    public String getNom() { //Devuelve el nombre
        return nom;
    }

    public int getForça() { //Devuelve la fuerza
        return força;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //Devuelve true si el pony tiene la fuerza necesaria para pasar el obstaculo en caso contrario devulve false
    public boolean superarObstacle(Obstacle o) { 
        this.energia -= o.getDificultat() / 2;

        if (energia > 0) {
            return true;
        } else {
            return false;
        }
    }
}
