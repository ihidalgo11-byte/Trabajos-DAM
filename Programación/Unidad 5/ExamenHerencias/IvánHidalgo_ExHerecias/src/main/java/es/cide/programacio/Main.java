package es.cide.programacio;
//Nom: Iván Hidalgo Montalvo
//DNI: 45611014J
public class Main {
    public static void main(String[] args) {
        Torrada t;
        Botifarro b = new Botifarro("Sant Sebastià", "2025", true);
        Sobrassada s = new Sobrassada("Sant Sebastià", "2025");

        System.out.println("Benvingut a la torrada de " + b.getFestivitat() + " " + b.getAny());
        System.out.println("He comprat un botifarró per " + b.getFestivitat());
        System.out.println("He comprat una sobrassada per " + b.getFestivitat());
        b.posarCarnAGraella();
        s.posarCarnAGraella();
        System.out.println("Vaig a mirar si estan fets:");
        while (!b.estaFet() || !s.estaFet()) { //Si uno de los dos metodos devuelven false entra y no sale del bucle hasta que los dos sean true
            if (!b.estaFet() && !s.estaFet()) { //Dependiendo de lo que devuelvan los metodos sale un mensaje diferente
                System.out.println("El botifarró està cru i la sobrassada està cru. He d'esperar.");
            } else if (!b.estaFet() && s.estaFet()) {
                System.out.println("El botifarró està cru i la sobrassada està fet. He d'esperar.");
            } else if (b.estaFet() && !s.estaFet()) {
                System.out.println("El botifarró està fet i la sobrassada està cru. He d'esperar.");
            }
        }
        System.out.println("El botifarró està fet i la sobrassada està fet. Ja puc anar a sopar.");
        b.assaborir(); 
        s.assaborir(); 
        System.out.println("Au, ja està tot fet! Visca Sant Sebastià!");
    }
}