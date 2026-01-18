import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int secuencia;
        int anterior = 0;
        Boolean sec = false;
        Boolean masGrande = false;
        while (sc.hasNextInt()) {
            secuencia = sc.nextInt();
            if (secuencia > 3143) {
                 if (secuencia > anterior && !sec) {
                    sec = true;
                 }
            }
            if (secuencia < anterior && sec) {
                    masGrande = true;
                }
            anterior = secuencia;
        }
        if (masGrande) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}

