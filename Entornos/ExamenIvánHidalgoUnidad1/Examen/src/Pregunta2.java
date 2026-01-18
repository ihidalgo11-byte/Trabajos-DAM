import java.util.Scanner;
public class Pregunta2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int prin = 0;
        int fin = 0;
        int numero = 0;
        Boolean priSI = false;
        String secuencia = "";
        while (!secuencia.equals("*")) {
            secuencia = sc.next();
            if (priSI) {
                numero++;
            }
            if (secuencia.equals("principi")) {
                priSI = true;
                prin++;
            } 
            if (secuencia.equals("final")) {
                fin++;
                priSI = false;
            }
            if (fin == 1 && prin == 0) {
                secuencia = "*";
            }   
        }
            if (fin == 1 && prin == 1) {
                System.out.println(numero-1);
            } else {
                System.out.println("incorrecte");
            }
        sc.close();
    }
}
