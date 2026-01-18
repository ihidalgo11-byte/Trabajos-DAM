package es.cide.programacio;
//Nom: Iván Hidalgo Montalvo
//DNI: 45611014j
//Fecha: 2/12/202
import java.util.Random;
public class Obstacle {
    Random random = new Random();
    private int aleatorio;
    private String tipus[] = {"Seto", "Barra", "Valla"};
    private int dificultat;
    private String tipo;

    public Obstacle() {
        this.dificultat = random.nextInt(7)+1;
        this.aleatorio = random.nextInt(3);
        this.tipo = tipus[aleatorio];
    }

    public int getDificultat() { //Delvuelve la dificultat
        return dificultat;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDificultat(int dificultat) {
        this.dificultat = dificultat;
    }

    public void setTipus(String[] tipus) {
        this.tipus = tipus;
    }
    
    
}



