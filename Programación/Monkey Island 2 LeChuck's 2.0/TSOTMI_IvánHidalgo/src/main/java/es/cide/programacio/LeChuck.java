package es.cide.programacio;

import java.util.Random;

public class LeChuck extends Pirata {

    Random random = new Random();
    private int insulto1, insulto2, insulto3;
    private String[] insultosPropios = new String[4]; // Array que guarda los insultos de LeChuck
    private String[] respuestasCorrectas = new String[4]; // Array que guarda las respuestas a los insultos del pirata
    private int posicion;
    private boolean vivo;

    public LeChuck(String insultos[], String respuestas[], int vida) {
        super(insultos, respuestas, "LeChuck", vida);
        this.vivo = true;
        this.insulto1 = random.nextInt(insultos.length); // Genera un numero aleatorio que indica la posicion del insulto
        this.insulto2 = random.nextInt(insultos.length);
        while (insulto1 == insulto2) {
            this.insulto2 = random.nextInt(insultos.length);
        }
        this.insulto3 = random.nextInt(insultos.length);
        while (insulto3 == insulto2 || insulto3 == insulto1) {
            this.insulto3 = random.nextInt(insultos.length);
        }
        this.insultosPropios[0] = insultos[insulto1]; // Guarda el insulto en la primera posicion del array
        this.insultosPropios[1] = insultos[insulto2];
        this.insultosPropios[2] = insultos[insulto3];
        this.insultosPropios[3] = "Tirare tus entrañas por la popa de mi barco";
        this.respuestasCorrectas[0] = respuestas[insulto1]; // Guarda la respuesta del insulto en primera posicion
        this.respuestasCorrectas[1] = respuestas[insulto2];
        this.respuestasCorrectas[2] = respuestas[insulto3];
        this.respuestasCorrectas[3] = "Mi abuela lanza amenazas más temibles… y está muerta.";
    }

    @Override
    public void insultar() { // Enseña uno de los 4 insultos del pirata
        posicion = random.nextInt(4);
        System.out.println(insultosPropios[posicion]);
    }

    @Override
    public boolean vida() { // Resta vida al pirata si el heroe acierta
        this.vida--;
        if (this.vida <= 0) { // Si la vida llega a 0 el pirata muere
            this.vivo = false;
            System.out.println("LeChuck ha muerto!");
        } else {
            System.out.println("LeChuck tiene " + vida + " de vida restante.");
        }
        return this.vivo;
    }
}
