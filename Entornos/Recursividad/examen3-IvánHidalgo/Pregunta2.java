
import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(countaa(s));
        sc.close();
    }
    public static int countaa(String s) {
        if (s.length() < 2) {
            return 0;
        }
        if (s.charAt(0) == 'a' && s.charAt(1) == 'a') {
            if (s.substring(1).length() >= 2 && s.substring(1).charAt(1) == 'a') {
                return 2 + countaa(s.substring(1));
            }
            return 1 + countaa(s.substring(1));
        } else return countaa(s.substring(1));
    }
}
