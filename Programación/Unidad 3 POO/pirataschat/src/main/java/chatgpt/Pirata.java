package chatgpt;

import java.util.Random;

public class Pirata {
    private String nom;
    private int vida;
    private String[] insults;
    private String[] respostesCorrectes;

    public Pirata(String nom) {
        this.nom = nom;
        Random rnd = new Random();
        vida = rnd.nextInt(3) + 1; // vida entre 1 i 3

        // Cada pirata té 3 insults i les seves respostes correctes
        insults = new String[]{
            "Ets tan lleig com un mico amb barba!",
            "El teu alè mataria una balena!",
            "No sabries lluitar ni amb un nen petit!"
        };

        respostesCorrectes = new String[]{
            "Almenys jo puc afaitar-me!",
            "Millor això que pudor de ron barat!",
            "M’has vist lluitar? No t’hauries de riure!"
        };
    }

    // Retorna un insult aleatori
    public String insultar() {
        Random rnd = new Random();
        int i = rnd.nextInt(insults.length);
        return insults[i];
    }

    // Comprova si la resposta és correcta (molt simple: segons el mateix índex)
    public boolean replica(String resposta) {
        for (String correcta : respostesCorrectes) {
            if (resposta.equalsIgnoreCase(correcta)) {
                return true;
            }
        }
        return false;
    }

    // Resta vida i retorna si encara és viu
    public boolean vida() {
        vida--;
        System.out.println(nom + " perd un punt de vida! Vida restant: " + vida);
        return vida > 0;
    }

    public boolean estaViu() {
        return vida > 0;
    }

    public String getNom() {
        return nom;
    }
}

