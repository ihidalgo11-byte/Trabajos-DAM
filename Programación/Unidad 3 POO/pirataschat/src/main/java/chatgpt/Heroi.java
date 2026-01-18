package chatgpt;

import java.util.Scanner;

public class Heroi {
    private String nom;
    private int vida;
    private String[] respostes = {
        "Almenys jo puc afaitar-me!",
        "Millor això que pudor de ron barat!",
        "M’has vist lluitar? No t’hauries de riure!",
        "Sóc el terror dels set mars!",
        "Et penediràs d’haver-me desafiat!"
    };

    public Heroi(String nom, int vida) {
        this.nom = nom;
        this.vida = vida;
    }

    // Mètode per defensar-se: tria una resposta
    public String defensar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEl pirata t’insulta! Com vols respondre?");
        for (int i = 0; i < respostes.length; i++) {
            System.out.println((i + 1) + ". " + respostes[i]);
        }
        System.out.print("Tria una resposta (1-" + respostes.length + "): ");
        int opcio = sc.nextInt();
        if (opcio < 1 || opcio > respostes.length) opcio = 1;

        String resposta = respostes[opcio - 1];
        System.out.println(nom + ": \"" + resposta + "\"");
        return resposta;
    }

    // Resta un punt de vida i diu si segueix viu
    public boolean vida() {
        vida--;
        System.out.println(nom + " perd un punt de vida. Vida restant: " + vida);
        return vida > 0;
    }

    public boolean estaViu() {
        return vida > 0;
    }

    public String getNom() {
        return nom;
    }
}

