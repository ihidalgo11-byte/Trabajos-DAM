package es.cide.programacio;
//Nombre: Iván Hidalgo Montalvo
//DNI: 45611014J
//Fecha: 14/10/2025
import java.util.Scanner;
import java.util.Random;
public class Batalla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int puntuacion = 0; 
        int numeroInsulto; //Variable para seleccionar el un numero random dentro de los arrays
        int posicionCorrecta; //Varible para generar un numero random y segun el numero generado imprimira la respuesta correcta en una posicion diferente
        int respuesta; //Varible para guardar la respuesta del usuario
        int contadorPrimerInsulto = 0, contadorSegundoInsulto = 0, contadorTercerInsulto = 0, contadorCuartoInsulto = 0, contadorQuintoInsulto = 0; //Varibles contador para no repetir los insultos
        //4 arrays de los cuales el primero guarda los insultos, el segundo las respuestas correctas, el tercero la primera mitad de las incorrectas y el ultimo la otra mitad de las incorrectas
        String[] insultos = {
            "¡He hablado con simios más educados que tú!",
            "Tienes el atractivo de una iguana.", 
            "Tus labios me recuerdan a los del pescado del día.", 
            "Si tu hermano es como tú, mejor casarse con un cerdo.", 
            "Dicen que mis puños son un arma letal."
            };
        String[] respuestasCorrectas = {
            "Me alegra que asistieras a tu reunión familiar.", 
            "¿Es que TANTO me parezco a tu hermana?", 
            "Cuando acabe CONTIGO, serás un bistec con disentería.", 
            "Me haces pensar que alguien ya lo ha hecho.", 
            "Pues tu aliento debería considerarse igual."
            };
        String[] malas1 = {
            "Ah, ¿Ya has obtenido ese trabajo de barrendero?", 
            "¿Incluso antes de que huelan tu aliento?", 
            "Te habrá enseñado todo lo que sabes.", 
            "Tu solo olor me deja enfadado, agitado y enojado.", 
            "Contigo alrededor, preferiría ser fumigado"};
        String[] malas2 = {
            "Al menos el mío puede ser identificado.", 
            "Es esa tu cara, pensé que era tu trasero.", 
            "Me rendiría si eso me evitara tener que mirarte.", 
            "Con tu aliento, seguro que todos fueron asfixiados.", 
            "Entonces deberías cambiar a descafeinado."
        };
        System.out.println("Bienvenido a Monkey Island"); 
        System.out.println("El juego consiste en una batalla por rondas de insultos entre piratas donde verás un insulto del enemigo y deberás elegir entre 3 respuestas; si aciertas ganarás 2 puntos y si fallas perderás 1 punto."); //Imprime la explicacion del juego
        System.out.println("Indica un numero de rondas hasta un maximo de 5:");
        int rondas = sc.nextInt(); //Varible la cual pide y guarda el numero de rondas introducidas por el usuario
            for (int i = 0; i < rondas; i++) { //Bucle para ejecutar todas las lineas de dentro hasta que la variable i sea igual a las rondas indicadas por el usuario
                numeroInsulto = random.nextInt(5); //Genera un numero aleatorio entre 0 y 4 dentro de la variable para imprimir los strings del array que esten en la posicion del numero generado
                posicionCorrecta = random.nextInt(3)+1; //Genera un numero aleatorio entre 1 y 3 gracias al +1 para indicar en que posicion se tiene que imprimir la respuesta correcta
                //Bucle para volver a generar un numero aleatorio en caso de que se repita el numero de un insulto ya utilizado
                while (contadorPrimerInsulto == 1 && numeroInsulto == 0 || contadorSegundoInsulto == 1 && numeroInsulto == 1 || contadorTercerInsulto == 1 && numeroInsulto == 2 || contadorCuartoInsulto == 1 && numeroInsulto == 3 || contadorQuintoInsulto == 1 && numeroInsulto == 4) {
                    numeroInsulto = random.nextInt(5); //Genera otro numero aleatorio si se cumple las condiciones del bucle while
                }
                System.out.println(insultos[numeroInsulto]); //Imprime el insulto guardado en la posicion del numero generado aleatoriamente
                if (posicionCorrecta == 1) { //En caso de que el numero generado dentro de respuestaCorrecta sea 1 imprime la respuesta correcta en la primera posicion y las incorrectas en la segunda y tercera
                    System.out.println("0. Escapar de la batalla");
                    System.out.println("1. "+respuestasCorrectas[numeroInsulto]);
                    System.out.println("2. "+malas1[numeroInsulto]);
                    System.out.println("3. "+malas2[numeroInsulto]);
                } else if (posicionCorrecta == 2) { //En caso de que el numero generado dentro de respuestaCorrecta sea 2 imprime la respuesta correcta en la segunda posicion y las incorrectas en la primera y tercera
                    System.out.println("0. Escapar de la batalla");
                    System.out.println("1. "+malas1[numeroInsulto]);
                    System.out.println("2. "+respuestasCorrectas[numeroInsulto]);
                    System.out.println("3. "+malas2[numeroInsulto]);
                } else if (posicionCorrecta == 3) { //En caso de que el numero generado dentro de respuestaCorrecta sea 3 imprime la respuesta correcta en la tercera posicion y las incorrectas en la primera y segunda
                    System.out.println("0. Escapar de la batalla");
                    System.out.println("1. "+malas1[numeroInsulto]);
                    System.out.println("2. "+malas2[numeroInsulto]);
                    System.out.println("3. "+respuestasCorrectas[numeroInsulto]);
                }
                respuesta = sc.nextInt(); //Guarda dentro de la varible respuesta el numero introducido por el usuario
                
                if (respuesta == posicionCorrecta) { //En caso de que el numero introducido por el usuario sea igual que el de posicionCorrecta imprime el mensaje indicado y suma 2 a la varible puntuacion
                    System.out.println("Respuesta correcta! +2 puntos");
                    puntuacion = puntuacion + 2;
                } else if (respuesta == 0) { //En caso de que el numero introducido sea 0 sale del bucle
                    System.out.println("Has escapado de la batalla como un covarde!");
                    i=i+6;
                } else { //En caso contrario resta 1 a la variable puntuacion
                    System.out.println("Respuesta incorrecta! -1 punto");
                    puntuacion = puntuacion - 1;
                }
                //Suma 1 a las varibles para no repetir insultos
                if (numeroInsulto == 0) {
                    contadorPrimerInsulto++;
                } else if (numeroInsulto == 1) {
                    contadorSegundoInsulto++;
                } else if (numeroInsulto == 2) {
                    contadorTercerInsulto++;
                } else if (numeroInsulto == 3) {
                    contadorCuartoInsulto++;
                } else if (numeroInsulto == 4) {
                    contadorQuintoInsulto++;
                }
            }
            if (puntuacion >= 8) { //Si la varible puntuacion es major o igual a 8 imprime el mensaje indicado y la puntuacion total
                System.out.println("\n¡Eres el rey de los piratas! Puntuacion total: "+puntuacion);
            } else if (puntuacion >= 4) { //Si la varible puntuacion es major o igual a 4 imprime el mensaje indicado y la puntuacion total
                System.out.println("\nTe has defendido como un buen marinero. Puntuacion total: "+puntuacion);
            } else { //Si la varible puntuacion es menor a 4 imprime el mensaje indicado y la puntuacion total
                System.out.println("\nLos loros se ríen de ti. Puntuacion total: "+puntuacion);
            }
        sc.close();
    }
}