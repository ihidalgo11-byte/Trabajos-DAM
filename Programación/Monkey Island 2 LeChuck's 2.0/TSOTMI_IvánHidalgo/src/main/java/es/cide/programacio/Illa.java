package es.cide.programacio;

//DNI: 45611014j
//Nom: Iván Hidalgo Montalvo
import java.util.Random;

public class Illa {
    Random random = new Random();
    // Atributos
    private String nom;
    private int nombres;
    private int mida;
    private Pirata[] arrayPiratas; // Array con medida varible que guarda la cantidad de piratas generados
    private String respuestas[];
    private String insultos[];
    private int index;
    private String piratas[] = {
                            "Vaelindra Corazón de Marea",
                            "Daniel el Oscuro",
                            "Nymia del Horizonte Partido",
                            "Korven Atralmar",
                            "Selvar Noctebris",
                            "Lirien de los Vientos Rotos",
                            "Dravos Mareoscuro"
                };
    // Constructor
    public Illa(String respuestas[], String insultos[]) {
        this.nom = "Tintamarre"; // Nombre de la isla
        this.mida = random.nextInt(5) + 3; // Cantidad de piratas entre 3 y 7
        this.arrayPiratas = new Pirata[mida]; // Indica al array la medida
        this.index = 0;
        this.respuestas = respuestas;
        this.insultos = insultos;
        while (index < mida - 1) { // Genera la cantidad de piratas que hay en la isla y los guarda en el array
            this.nombres =  random.nextInt(0,6);
            arrayPiratas[index] = new Pirata(insultos, respuestas, this.piratas[nombres], random.nextInt(1,3));
            index++;
            }
            arrayPiratas[mida - 1] = new LeChuck(insultos, respuestas, random.nextInt(2,6));
        }

    // Getters y Setters
    public String getNombreIlla() { // Devuelve el nombre de la isla
        return nom;
    }

    public int getCantidadPiratas() { // Devuelve la cantidad de piratas que hay en la isla
        return mida;
    }

    // Metodos
    public Pirata vullUnPirata(int bucle) { // Devuelve el objeto de tipo pirata de la posicion indicada
        return arrayPiratas[bucle];

    }
}