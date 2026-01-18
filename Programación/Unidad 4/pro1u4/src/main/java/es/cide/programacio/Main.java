package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        
        String enterP = "45";
        String decimal = "3.5";
        String varB = "true";
        String caracter = "A";
        double suma;

        int enterP2 = Integer.parseInt(enterP);
        double decimal2 = Double.parseDouble(decimal);
        boolean varB2 = Boolean.parseBoolean(varB);
        char caracter2;

        System.out.println(enterP2+decimal2);
        System.out.println(varB);
    }
}