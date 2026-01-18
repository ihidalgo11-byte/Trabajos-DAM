package es.cide.programacio;

//DNI: 45611014j
//Nom: Iván Hidalgo Montalvo
import java.util.Random;

public abstract class Pirata extends Personatge implements Fight, Speak {
    Random random = new Random();

    // Atributos
    protected String insultos[];
    protected String respuestas[];
    protected int posicion = random.nextInt(3);
    protected int insulto1, insulto2, insulto3;
    protected String[] insultosPropios = new String[3]; // Array de 3 espacios que guarda los insultos del pirata
    protected String[] respuestasCorrectas = new String[3];

    // Constructor
    public Pirata(String insultos[], String respuestas[], String nom, int vida) {
        super(nom, vida);
        this.insultos = insultos;
        this.respuestas = respuestas;

        this.insulto1 = random.nextInt(insultos.length); // Genera un numero aleatorio que indica la posicion del insulto
        this.insulto2 = random.nextInt(insultos.length);
        this.insulto3 = random.nextInt(insultos.length);
        while (insulto1 == insulto2 || insulto1 == insulto3 || insulto2 == insulto3) { // Bucle para que no se repitan los insultos
            insulto1 = random.nextInt(insultos.length);
            insulto2 = random.nextInt(insultos.length);
            insulto3 = random.nextInt(insultos.length);
        }
        this.insultosPropios[0] = insultos[insulto1]; // Guarda el insulto en la primera posicion del array
        this.insultosPropios[1] = insultos[insulto2];
        this.insultosPropios[2] = insultos[insulto3];
        this.respuestasCorrectas[0] = respuestas[insulto1]; // Guarda la respuesta del insulto en primera posicion
        this.respuestasCorrectas[1] = respuestas[insulto2];
        this.respuestasCorrectas[2] = respuestas[insulto3];
    }

    // Getters y Setters

    public int getVida() { // Devulve la vida del pirata
        return this.vida;
    }

    public String getNombrePirata() { // Devuelve el nombre
        return this.nom;
    }

    // Metodos
    public void insultar() { // Enseña uno de los 3 insultos del pirata
        posicion = random.nextInt(3);
        System.out.println(insultosPropios[posicion]);
    }

    public boolean replica(String respuestaUser) { // Compara la respuesta del usuario con las respuesta correcta del insulto
        return respuestaUser.equals(respuestasCorrectas[posicion]);
    }

    public boolean vida() { // Resta vida al pirata si el heroe acierta
        this.vida--;
        if (this.vida == 0) { // Si la vida llega a 0 el pirata muere
            this.vivo = false;
            System.out.println("El pirata ha muerto!");
        } else {
            System.out.println("El pirata tiene " + vida + " de vida restante.");
        }
        return this.vivo;
    }
}