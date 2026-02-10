package es.cide.programacio;

public class Robot {
    private String nom;
    private int energia;
    private int fuerza;

    public Robot (String nom, int energia, int fuerza) {
        this.nom = nom;
        this.energia = energia;
        this.fuerza = fuerza;
    }

    public String getNom() {
        return nom;
    }

    public int getEnergia() {
        return energia;
    }

    public int getFuerza() {
        return fuerza;
    }

    public boolean superarObstaculo(Obstacle o) {
        energia -= o.getDificultat() * 2;

        if (energia > 0) {
            return true;
        } else {
            return false;
        }
    } 
}
