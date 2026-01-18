package chatgpt;

public class Main {
    public static void main(String[] args) {
        Heroi heroi = new Heroi("Guybrush", 10);
        Illa illa = new Illa("Mêlée Island");

        System.out.println("Benvingut a " + illa.getNom() + ", " + heroi.getNom() + "!");
        System.out.println("Hi ha " + illa.getNumPirates() + " pirates esperant-te...\n");

        // Enfrontar-se a cada pirata
        for (int i = 0; i < illa.getNumPirates() && heroi.estaViu(); i++) {
            Pirata p = illa.vullUnPirata(i);
            System.out.println(" T'enfrontes a " + p.getNom() + "!");

            // Batalla d’insults
            while (p.estaViu() && heroi.estaViu()) {
                String insult = p.insultar();
                System.out.println(p.getNom() + ": \"" + insult + "\"");

                String respostaHeroi = heroi.defensar();
                boolean correcte = p.replica(respostaHeroi);

                if (correcte) {
                    System.out.println("👉 Bona resposta! El pirata queda tocat!");
                    p.vida();
                } else {
                    System.out.println("💥 Mala resposta! El pirata et colpeja!");
                    heroi.vida();
                }
            }

            if (!heroi.estaViu()) {
                System.out.println(" " + heroi.getNom() + " ha mort! Els pirates guanyen!");
                break;
            } else {
                System.out.println("🏴‍☠️ Has vençut " + p.getNom() + "!\n");
            }
        }

        if (heroi.estaViu()) {
            System.out.println("" + heroi.getNom() + " ha derrotat tots els pirates de l’illa!");
        }
    }
}
