
import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(engrandir(x));
        sc.close();
    }
    public static int maximo(int a, int b) {
        if(a > b) {
            return a;
        } else return b;
    }
    public static int engrandir(int x) {
        if (x < 10) {
            return x;
        }
        return engrandir(x/10)*10 + maximo(engrandir(x/10)%10,x%10);
    }
}
