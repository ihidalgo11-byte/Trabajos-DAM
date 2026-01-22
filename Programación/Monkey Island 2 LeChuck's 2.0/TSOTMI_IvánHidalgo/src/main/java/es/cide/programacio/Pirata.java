package es.cide.programacio;

//DNI: 45611014j
//Nom: Iván Hidalgo Montalvo
import java.util.Random;

public class Pirata extends Personatge implements Fight, Speak {
    Random random = new Random();

    // Atributos
    private String insultos[];
    private String respuestas[];
    private boolean vivo = true;
    private String[] insultosPropios = new String[3]; // Array de 3 espacios que guarda los insultos del pirata
    private String[] respuestasCorrectas = new String[3]; // Array que guarda las respuestas a los insultos del pirata
    private int insulto1, insulto2, insulto3;
    private int posicion;

    // Constructor
    public Pirata(String insultos[], String respuestas[], String nom, int vida) {
        super(nom, vida);
        this.insultos = insultos;
        this.respuestas = respuestas;
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
        this.respuestasCorrectas[0] = respuestas[insulto1]; // Guarda la respuesta del insulto en primera posicion
        this.respuestasCorrectas[1] = respuestas[insulto2];
        this.respuestasCorrectas[2] = respuestas[insulto3];
    }

    // Getters y Setters
    public boolean getVivoPirata() { // Devuelve si el pirata esta vivo o muerto
        return this.vivo;
    }

    public int getVida() { // Devulve la vida del pirata
        return this.vida;
    }

    public String getNombrePirata() { // Devuelve el nombre
        return nom;
    }

    // Metodos
    public void defensar() {
    }

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
        } else {
            System.out.println("El pirata tiene " + vida + " de vida restante.");
        }
        return this.vivo;
    }

    public void sayHello() {
        System.out.println(getNombrePirata() + ": Mira quién se atreve a poner un pie en estas aguas…");
    }

    public void sayGoodBye() {
        System.out.println(getNombrePirata() + ": ¡Juro… que… volveré… como fantasma!");
    }
}