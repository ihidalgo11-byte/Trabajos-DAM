package es.cide.programacio;

import java.util.Random;

public class Guybrush extends Heroi {

    Random random = new Random();
    
    private String[] respuestasRandom;

    public Guybrush(String respuestas[]) {
        super(respuestas, "Guybrush", 10);
        vivo = true;
        this.respuestasRandom = new String[4];

    }

    @Override
    public void defensar() {
        boolean[] resUsadas = new boolean[respuestas.length]; //Array booleano para que no se repitan las respuestas
        int contador = 0;
        while (contador < 4) {
            int resGenerada = random.nextInt(respuestas.length); //Genera un numero aleatorio teniendo en cuenta la longitud del array de respuestas
            if (!resUsadas[resGenerada]) { //Si la posicion del array booleano tiene false entra y la cambia a true
                resUsadas[resGenerada] = true;
                respuestasRandom[contador] = respuestas[resGenerada]; //Guarda las respuesta aleatoria en la posicion indicada por el contardor dentro del array string
                contador++;
            }
        }
        System.out.println("Elige una respuesta (1-4):");
        for (int i = 0; i < respuestasRandom.length; i++) { //Bucle que imprime la respuestas guardadas anteriormente
            System.out.println((i + 1) + ". " + respuestasRandom[i]);
        }
        int resElegida = sc.nextInt();
        res2 = respuestasRandom[resElegida - 1];
    }

    @Override
    public boolean vida() {
        this.vida = vida - 2;
        if (this.vida == 0) { // Si la vida llega a 0 el heroe muere
            this.vivo = false;
            System.out.println("Guybrush ha muerto!");
        } else {
            System.out.println("Al heroe Guybrush le queda " + vida + " de vida restante.");
        }
        return this.vivo;
    }

    @Override
    public void sayHello() {
        System.out.println("Guybrush: ¡Eh, pirata! No hagas que tenga que usar mi espada contigo.");
    }

    @Override
    public void sayGoodBye() {
        System.out.println("Guybrush: ¡Hasta luego! No te preocupes, los tiburones son muy puntuales.");
    }

}
