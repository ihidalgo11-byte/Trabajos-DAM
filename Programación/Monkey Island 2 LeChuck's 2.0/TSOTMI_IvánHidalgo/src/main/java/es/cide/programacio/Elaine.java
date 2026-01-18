package es.cide.programacio;

public class Elaine extends Heroi {

    public Elaine(String[] respuestas) {
        super(respuestas, "Elaine", 10);
        vivo = true;
    }

    public int getVida() {
        return this.vida;
    }

    @Override
    public void defensar() { //Imprime todas las respuestas por pantalla y pide que el usuario elija una
        for (int i = 0; i < respuestas.length; i++) {
            System.out.println((i + 1) + "." + this.respuestas[i]);
        }
        System.out.println("Elige la contestación correcta (1-9):");
        int res = sc.nextInt();
        res2 = respuestas[res - 1];
    }

    @Override
    public boolean vida() {
        this.vida--;
        if (this.vida == 0) { // Si la vida llega a 0 el heroe muere
            this.vivo = false;
            System.out.println("Elaine ha muerto!");
        } else {
            System.out.println("Elaine tiene " + vida + " de vida restante.");
        }
        return this.vivo;
    }

    @Override
    public void sayHello() {
        System.out.println("Elaine: Pirata, vigila tus pasos y actúa con honor.");
    }

    @Override
    public void sayGoodBye() {
        System.out.println("Elaine: No pensé que el mar sería mi tumba… pero al menos luché hasta el final.");
    }

}
