package es.cide.programacio;

public abstract class Coche extends Vehicle {
    protected int plaçes;
    protected int velocitatMax;

    public Coche(String matricula, String marca, int plaçes, int velocitatMax) {
        super(matricula, marca);
        this.plaçes = plaçes;
        this.velocitatMax = velocitatMax;
    }
    
    public int getVelocitatMaxima() {
        return velocitatMax;
    }
}   
