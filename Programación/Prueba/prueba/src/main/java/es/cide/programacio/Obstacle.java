package es.cide.programacio;

import java.util.Random;
public class Obstacle {
    private Random random = new Random();
    private String tipus;
    private int dificultat;

    public Obstacle(String tipus) {
        dificultat = random.nextInt(10)+1;
        this.tipus = tipus;
    }
    public int getDificultat() {
        return dificultat;
    }

    public String toString() {
        System.out.println("El obstaculo "+tipus+" tiene una dificultad de "+dificultat);
        return tipus;
    }
}
