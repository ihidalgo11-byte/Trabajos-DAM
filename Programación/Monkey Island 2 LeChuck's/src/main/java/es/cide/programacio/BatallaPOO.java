package es.cide.programacio;

//DNI: 45611014j
//Nom: Iván Hidalgo Montalvo
import java.util.Scanner;

public class BatallaPOO {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String respuestaUser = "";
                boolean correcta;
                String respuestas[] = {
                                "1. Es esa tu cara, pensé que era tu trasero.",
                                "2. ¡Tus palabras no son de un macho!",
                                "3. Entonces se un buen perro ¡Siéntate! ¡Quieto!",
                                "4. Te habrá enseñado todo lo que sabes.",
                                "5. Sí que las hay, sólo que nunca las has aprendido.",
                                "6. ¿Es que TANTO me parezco a tu hermana?",
                                "7. Entonces la tuya era el kraken: fea, gorda y siempre hundiendo barcos.",
                                "8. Entonces ya debe olerte familiar.",
                                "9. Y tú eres tan insignificante que ni el terremoto que provoca tu madre podría despertarte."
                };
                String insultos[] = {
                                "¡Si luchas cara a cara conmigo necesitarás un consejero!",
                                "¡Tu madre es un marimacho!",
                                "¡Te perseguiré dia y noche sin ningún respeto!",
                                "¡Una vez tuve un perro más listo que tu!",
                                "Ya no hay técnicas que te puedan salvar.",
                                "Tienes el atractivo de una iguana.",
                                "Tu madre debía de ser una sirena, pero del tipo que asusta a los barcos.",
                                "Tu barco huele a derrota y pescado podrido.",
                                "Tu madre esta tan gorda que hace temblar los muelles de todos los puertos."
                };
                String piratas[] = {
                                "Vaelindra Corazón de Marea",
                                "Daniel el Oscuro",
                                "Nymia del Horizonte Partido",
                                "Korven Atralmar",
                                "Selvar Noctebris",
                                "Lirien de los Vientos Rotos",
                                "Dravos Mareoscuro"
                };
                Illa i = new Illa(respuestas, insultos); // Crea la isla
                System.out.println("BIENVENIDO A MOKEY ISLAND ");
                System.out.println("");
                System.out.println("Ponle nombre al Heroe: ");
                String nombre = sc.nextLine(); // Solicita el nombre del heroe
                Heroi h = new Heroi(nombre, respuestas); // Crea al heroe
                Pirata p = new Pirata(insultos, respuestas); // Crea al pirata
                System.out.println("El heroe " + nombre + " llega a la isla " + i.getNombreIlla() + " en la que hay "
                                + i.getCantidadPiratas() + " piratas.");
                System.out.println("");
                for (int bucle = 0; bucle < i.getCantidadPiratas(); bucle++) { // Bucle for para luchar con todos los piratas
                        p = i.vullUnPirata(bucle); // Asigna un nuevo pirata vivo
                        System.out.println("Te encuentras con el pirata " + p.getNombrePirata() + " el cual tiene "
                                        + p.getVida() + " de vida.");
                        System.out.println("");
                        while (h.getVivo() == true && p.getVivoPirata() == true) { // Bucle de la lucha de insultos
                                System.out.println("El pirata " + p.getNombrePirata() + " dice:");
                                System.out.println("");
                                p.insultar(); // Utiliza el metodo insultar de pirata
                                System.out.println("");
                                h.defensar(respuestaUser); // Imprime todas las respuestas y le pide al usuario un
                                                              // numero de respuesta
                                correcta = p.replica(respuestaUser); // Comprueba si la respuesta introducida es la
                                                                     // correcta
                                if (correcta) { // Si es correcta utiliza el metodo vida de pirata para quitarle 1 de vida
                                        System.out.println("");
                                        System.out.println("Correcto");
                                        p.vida();
                                } else { // Si no es correcta utiliza el metodo vida de heroe para quitarle 1 de vida al heroe
                                        System.out.println("");
                                        System.out.println("Incorrecto");
                                        h.vida();
                                }
                        }
                }
                sc.close();
                System.out.println("");
                if (h.getVivo() == true) { // Mensaje de victoria
                        System.out.println("Has acabado con todos los piratas de la isla!");
                } else { // Mensaje de derrota
                        System.out.println("Los piratas te han lanzado a los tiburones.");
                }
                System.out.println(
                                i.getCantidadPiratas() + " piratas asesinados y " + h.getVida() + " de vida restante.");
        }
}
