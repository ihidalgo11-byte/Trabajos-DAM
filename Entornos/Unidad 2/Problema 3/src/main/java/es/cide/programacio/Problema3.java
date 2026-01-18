package es.cide.programacio;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "ddd";
        boolean notGreater = true;

        String s = sc.next();
        while (notGreater) {
            s = sc.next();
            if (s.equals(".")){
                notGreater = false;
            } else if (a.compareTo(s) <= 0) {
                notGreater = false;
            }
        }
        if (s.equals(a)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
