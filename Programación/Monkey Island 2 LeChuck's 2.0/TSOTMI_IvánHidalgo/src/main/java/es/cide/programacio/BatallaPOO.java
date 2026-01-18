package es.cide.programacio;

//DNI: 45611014j
//Nom: Iván Hidalgo Montalvo
import java.util.Scanner;

public class BatallaPOO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuestaUser;
        boolean correcta;
        String respuestas[] = {
            "Es esa tu cara, pensé que era tu trasero.",
            "¡Tus palabras no son de un macho!",
            "Te habrá enseñado todo lo que sabes.",
            "Sí que las hay, sólo que nunca las has aprendido.",
            "¿Es que TANTO me parezco a tu hermana?",
            "Entonces la tuya era el kraken: fea, gorda y siempre hundiendo barcos.",
            "Entonces ya debe olerte familiar.",
            "Y tú eres tan insignificante que ni el terremoto que provoca tu madre podría despertarte.",
            "Mi abuela lanza amenazas más temibles y está muerta."
        };
        String insultos[] = {
            "¡Si luchas cara a cara conmigo necesitarás un consejero!",
            "¡Tu madre es un marimacho!",
            "¡Una vez tuve un perro más listo que tu!",
            "Ya no hay técnicas que te puedan salvar.",
            "Tienes el atractivo de una iguana.",
            "Tu madre debía de ser una sirena, pero del tipo que asusta a los barcos.",
            "Tu barco huele a derrota y pescado podrido.",
            "Tu madre esta tan gorda que hace temblar los muelles de todos los puertos."
        };

        Illa i = new Illa(respuestas, insultos); // Crea la isla
        System.out.println("BIENVENIDO A MOKEY ISLAND ");
        System.out.println("Elige tu héroe para enfrentarte a los piratas:");
        System.out.println("1 - Elaine: valiente pero inexperta, conoce todas las respuestas.");
        System.out.println("2 - Guybrush: pirata experimentado, solo verá 4 respuestas por ronda, ¡elige sabiamente!");
        System.out.print("Introduce 1 para Elaine o 2 para Guybrush: ");
        System.out.println("");
        Heroi h;
        Pirata p;
        int heroe = sc.nextInt();
        if (heroe == 1) { // Selecciona uno de los 2 heroes
            h = new Elaine(respuestas);
        } else {
            h = new Guybrush(respuestas);
        }
        
        System.out.println(h.getNombre() + " llega a la isla " + i.getNombreIlla() + " en la que hay " + i.getCantidadPiratas() + " piratas.");
        System.out.println("");
        for (int bucle = 0; bucle < i.getCantidadPiratas(); bucle++) { // Bucle for para luchar con todos los piratas
            p = i.vullUnPirata(bucle); // Asigna un nuevo pirata vivo
            if (h.getVivo()) {
                System.out.println(h.getNombre()+" se encuentra con el pirata " + p.getNombrePirata() + " el cual tiene " + p.getVida() + " de vida.");
                h.sayHello();
                System.out.println("");
                p.sayHello();
            }

            while (h.getVivo() && p.getVivoPirata()) { // Bucle de la lucha de insultos
                System.out.println("El pirata " + p.getNombrePirata() + " dice:");
                System.out.println("");
                p.insultar(); // Utiliza el metodo insultar de pirata
                System.out.println("");
                h.defensar(); // Imprime todas las respuestas y le pide al usuario un numero de respuesta
                System.out.println("");
                respuestaUser = h.getRes();
                correcta = p.replica(respuestaUser); // Comprueba si la respuesta introducida es la correcta
                if (correcta) { // Si es correcta utiliza el metodo vida de pirata para quitarle 1 de vida
                    System.out.println("");
                    System.out.println("Correcto");
                    p.vida();
                } else { // Si no es correcta utiliza el metodo vida de heroe para quitarle 1 de vida al heroe
                    System.out.println("");
                    System.out.println("Incorrecto");
                    h.vida();
                }
                if (!p.getVivoPirata()) { // Si el pirata muere se despide
                    p.sayGoodBye();
                } else if (!h.getVivo()) { // Si el heroe muere se despide
                    h.sayGoodBye();
                }
            }
        }
        sc.close();
        System.out.println("");
        if (h.getVivo()) { // Mensaje de victoria
            System.out.println("Has acabado con todos los piratas de la isla!");
        } else { // Mensaje de derrota
            System.out.println("Los piratas han lanzado a "+h.getNombre()+" a los tiburones.");
        }
        System.out.println(h.getVida() + " de vida restante.");
    }
}
