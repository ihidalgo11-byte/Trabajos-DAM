package es.cide.programacio;
//Nom: Iván Hidalgo Montalvo
//DNI: 45611014J
import java.util.Scanner; //Importa scanner
import java.util.Random; //Importa Random
public class Actividad2Ex {
    public static void main(String[] args) {
        Random numeroRandom = new Random(); //Inicio el Random
        Scanner sc = new Scanner(System.in); //Inicio el Scanner
        int numero = numeroRandom.nextInt(200)+1; //Genera un numero entre 0 y 199 pero gracias al +1 lo hace entre 1 y 200
        int numeroIntroducido; //Crea variable numeroIntroducido para guarda el numero que introduce el usuario
        int intentos = 0; //Inicia la variable intentos y la iguala a 0 para contar el numero de intentos que tarda el usuario en adivinar el numero
        int salir = 1; //Inicia la variable salir y la iguala a 1 para guardar el numero que introduce el usurio al final del programa el cual decide si sigue jugando o no
        System.out.println("Intenta adivinar el numero secreto:"); //Imprime el texto introducido
        while (salir == 1) { //Bucle while para que en caso de que la varible salir sea igual a 1 el codigo de dentro se vuelva a ejecutar
            for (int i = 0; i < 9999; i++) { //Bucle for en el cual no termina hasta que el usuario adivina el numero o pasa los 9999 intentos
                numeroIntroducido = sc.nextInt(); //Le pide al usuario que introduzca un numero que se guarda en la varible numeroIntroducido
                if (numeroIntroducido == numero) { //Si el usuario acierta el numero generado aleatoriamente se le suma 9999 a la varible i para salir del bucle for
                    i=i+9999; //Suma 9999 a i
                }
                if (numeroIntroducido > numero) { //Si el numero introducido es más grande que el numero generado aleatoriamente ejecuta las lineas de dentro
                    System.out.println("El numero es demasiado alto"); //Imprime el texto introducido
                    System.out.println("Introduce otro numero:"); //Imprime el texto introducido que pide otro numero
                } else if (numeroIntroducido < numero) { //Si el numero introducido es más pequeño que el numero generado aleatoriamente ejecuta las lineas de dentro
                    System.out.println("El numero es demasiado bajo"); //Imprime el texto introducido
                    System.out.println("Introduce otro numero:"); //Imprime el texto introducido que pide otro numero
                }
                intentos++; //Suma 1 a la varible intentos para contar los intetos del usuario
            }
            if (intentos == 1) { //Si la varible intentos es igual a 1 osea que el usuario ha acertado a la primera ejecuta las lineas de dentro
                System.out.println("Eres un crack!"); //Imprime un mensaje felicitación
            } else if (intentos<=10) { //Si la variable intentos es menor o igual a 10 osea que el usuario ha hacertado entre 2 y 10 intentos ejecuta las lineas de dentro
                System.out.println("No esta mal"); //Imprime un mensaje intermedio
            } else if (intentos>10) { //Si la varible intentos es major a 10 osea que el usuario ha acertado el numero después de 10 intentos ejecuta las lineas de dentro
                System.out.println("Se puede mejorar!"); //Imprime un mensaje de consolación
            }
            System.out.println("Intentos totales: "+intentos);
            System.out.println("----Introduce 1 para volver a jugar----"); //Imprime opcion de volver a jugar
            System.out.println("----Introduce 2 para salir----"); //Imprime opcion de salir del juego
            salir = sc.nextInt(); //Le pide al usuario que introduzca un numero 
            if (salir == 1) { //Si el numero introducido en la variable salir es 1 vuelve a hacer el bucle while y ejecuta todo otra vez
                System.out.println("Intenta adivinar el numero secreto:"); //Imprime el texto introducido
            } else if (salir == 2) { //Si el numero introducido en la varible salir es 2 sale del juego
                System.out.println("Hasta la proxima!"); //Imprime mensaje de despedida
            }
        }
    }
}