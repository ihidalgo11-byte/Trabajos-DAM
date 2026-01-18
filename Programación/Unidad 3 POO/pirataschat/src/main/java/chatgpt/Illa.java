package chatgpt;

import java.util.Random;

public class Illa {
    private String nom;
    private Pirata[] pirates;

    // Constructor: genera entre 3 i 7 pirates
    public Illa(String nom) {
        this.nom = nom;
        Random rnd = new Random();
        int numPirates = rnd.nextInt(5) + 3; // entre 3 i 7
        pirates = new Pirata[numPirates];

        // Generar pirates amb noms automàtics
        for (int i = 0; i < numPirates; i++) {
            pirates[i] = new Pirata("Pirata " + (i + 1));
        }
    }

    // Retorna el pirata de l’índex
    public Pirata vullUnPirata(int index) {
        if (index >= 0 && index < pirates.length) {
            return pirates[index];
        } else {
            return null;
        }
    }

    public int getNumPirates() {
        return pirates.length;
    }

    public String getNom() {
        return nom;
    }
}
