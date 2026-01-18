package es.cide.programacio;
//Nom: Iván Hidalgo Montalvo
//DNI: 45611014J
//Fecha: 9-10-2025
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        //Declara varible 'i' igual a 0 para hacer el bucle con while
        int i = 0;
        while (i<1) {
        //Imprime todas las opciones del menu
        System.out.println("----- MENU ----- ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        //Selecciona una de las opciones del menu con la variable "operacion"
        System.out.println("Introduce el numero de la operación");
        int operacion = sc.nextInt();
        //Switch y case permiten elegir qué operación realizar según la variable "operacion" 
        switch (operacion) {
            case 1:
                //Introduce los dos numeros con los que calcular con las variables "num1" y "num2"
                System.out.println("Introduce el primer numero");
                num1 = sc.nextInt();
                System.out.println("Introduce el segundo numero");
                num2 = sc.nextInt();
                //Caso 1 suma los 2 numeros
                System.out.println("Resultado = "+(num1+num2));
                break;
            case 2:
                System.out.println("Introduce el primer numero");
                num1 = sc.nextInt();
                System.out.println("Introduce el segundo numero");
                num2 = sc.nextInt();
                //Caso 2 resta los 2 numeros
                System.out.println("Resultado = "+(num1-num2));
                break;
            case 3:
                System.out.println("Introduce el primer numero");
                num1 = sc.nextInt();
                System.out.println("Introduce el segundo numero");
                num2 = sc.nextInt();
                //Caso 3 multiplica los 2 numeros
                System.out.println("Resultado = "+(num1*num2));
                break;
            case 4:
                System.out.println("Introduce el primer numero");
                num1 = sc.nextInt();
                System.out.println("Introduce el segundo numero");
                num2 = sc.nextInt();
                //Caso 4 divide el primer número entre el segundo (controlando que no sea 0)
                if (num2 == 0) {
                    //Si el segundo número es 0, se pide otro hasta que no lo sea
                    while (num2 == 0) {
                    System.out.println("Introduce un numero que no sea 0 en el segundo numero");
                    num2 = sc.nextInt();
                    }
                    //Muestra el resultado una vez corregido
                    System.out.println("Resultado = "+(num1/num2));
                    break;
                } else {
                    //Si el segundo número no es 0, realiza la división directamente
                    System.out.println("Resultado = "+(num1/num2));
                    break;
                }
            case 5:
                //Caso 5: Sale del programa mostrando un mensaje de despedida gracias a sumar 1 a la variable 'i'
                i++;
                System.out.println("Gracias por usar la calculadora");
                break;
            default:
                //Muestra error si la opción no es válida
                System.out.println("Error");
            }
        }
        //Cierra el escaner
        sc.close();
    }
}